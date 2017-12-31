SUMMARY = "Single-oscillator synth based on the Roland TB-303"
HOMEPAGE = "http://distrho.sourceforge.net/ports"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b \
"

SRC_URI = " \
    gitsm://github.com/DISTRHO/Nekobi.git \
"

SRCREV = "9e51059f8badedfab41971498680e229cccdb456"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

inherit qemu-ext pkgconfig

CLEANBROKEN = "1"

do_configure_prepend() {
	# manipulate scripts to keep lv2_ttl_generator-calls in script for qemu
    sed -i 's|$GEN ./$FILE|echo `pwd`/$FILE >> ${WORKDIR}/lv2_ttl_generator-data|g' `find ${S} -name *.sh`
}

EXTRA_OEMAKE += " \
    NOOPT=true \
"

do_compile_append() {
    # build ttl-files must be done in quemu
    for sofile in `cat ${WORKDIR}/lv2_ttl_generator-data`; do
        cd `dirname ${sofile}`
        echo "QEMU lv2_ttl_generator for ${sofile}..."
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/libs/lv2_ttl_generator')} ${sofile} || echo "ERROR: for QEMU lv2_ttl_generator for ${sofile}!"
    done
}

do_install() {
    install -d ${D}${libdir}/dssi
	install -m 0644 ${S}/bin/Nekobi-dssi.so ${D}${libdir}/dssi/

    install -d ${D}${libdir}/vst
	install -m 0644 ${S}/bin/Nekobi-vst.so ${D}${libdir}/vst/

    install -d ${D}${libdir}/lv2
	cp -r ${S}/bin/Nekobi.lv2 ${D}${libdir}/lv2/
}

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
