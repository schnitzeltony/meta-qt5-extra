SUMMARY = "Collection of LADSPA/LV2/VST/JACK audio plugins for high-quality processing"
HOMEPAGE = "http://www.zamaudio.com/?p=976"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += " \
    virtual/libx11 \
    virtual/libgl \
    liblo \
    jack \
    ladspa-sdk \
    rubberband \
    libsamplerate0 \
    libsndfile1 \
    fftw \
    zita-convolver \
"

inherit pkgconfig qemu-ext distro_features_check pack_audio_plugins

REQUIRED_DISTRO_FEATURE = "x11"

SRC_URI = " \
    gitsm://github.com/zamaudio/${BPN}.git \
    file://0001-remove-useles-braces-in-macros.patch \
"
SRCREV = "96ec0c7dbc9c034bc8716309b92fda84bb27cf92"
S = "${WORKDIR}/git"
PV = "3.10+git${SRCPV}"

do_configure_prepend() {
    rm -f ${WORKDIR}/lv2_ttl_generator-data
    # manipulate scripts to keep lv2_ttl_generator-calls in script for qemu
    sed -i 's|"$GEN" "./$FILE"|echo `pwd`/$FILE >> ${WORKDIR}/lv2_ttl_generator-data|g' ${S}/dpf/utils/generate-ttl.sh
}


EXTRA_OEMAKE += " \
    NOOPT=true \
    SKIP_STRIPPING=true \
"

do_compile_append() {
    # build ttl-files must be done in quemu
    for sofile in `cat ${WORKDIR}/lv2_ttl_generator-data`; do
        cd `dirname ${sofile}`
        echo "QEMU lv2_ttl_generator for ${sofile}..."
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/dpf/utils/lv2_ttl_generator')} ${sofile} || echo "ERROR: for QEMU lv2_ttl_generator for ${sofile}!"
    done
}

do_install() {
    ${MAKE} DESTDIR=${D} PREFIX= LIBDIR=${libdir} BINDIR=${bindir} install
}

PACKAGES =+ "${PN}-standalone"
FILES_${PN}-standalone = "${bindir}"
