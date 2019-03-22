SUMMARY = "A chorus audio effect plugin based on DSP code by Togu Audio Line (TAL)"
HOMEPAGE = "https://github.com/SpotlightKid/ykchorus"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02ad2afd072e9ce4a370bedb49e2b075"

inherit pkgconfig gtk-icon-cache qemu-ext pack_audio_plugins

DEPENDS += " \
    liblo \
    jack \
    virtual/libgl \
"

SRC_URI = "gitsm://github.com/SpotlightKid/ykchorus.git"
SRCREV = "a6b1027e327f5118bbe48ae01e9fa58e14f93479"
PV = "0.2.2+git${SRCPV}"
S = "${WORKDIR}/git"

do_compile() {
    rm -f ${WORKDIR}/lv2_ttl_generator-data
    # manipulate scripts to keep lv2_ttl_generator-calls in script for qemu
    sed -i 's|"$GEN" "./$FILE"|echo `pwd`/$FILE >> ${WORKDIR}/lv2_ttl_generator-data|g' ${S}/dpf/utils/generate-ttl.sh

    PREFIX=${prefix} \
    NOOPT=true \
    SKIP_STRIPPING=true \
    oe_runmake

    # build ttl-files must be done in quemu
    for sofile in `cat ${WORKDIR}/lv2_ttl_generator-data`; do
        cd `dirname ${sofile}`
        echo "QEMU lv2_ttl_generator for ${sofile}..."
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/dpf/utils/lv2_ttl_generator')} ${sofile} || echo "ERROR: for QEMU lv2_ttl_generator for ${sofile}!"
    done
}

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=${prefix} LIBDIR=${libdir} install
}
