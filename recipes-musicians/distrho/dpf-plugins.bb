SUMMARY = "Collection of DPF-based plugins"
LICENSE = "ISC & GPLv2 & GPLv3 & LGPLv3 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=ec024abddfab2ee463c8c1ad98883d12 \
"

SRC_URI = " \
    git://github.com/DISTRHO/DPF-Plugins.git \
"

SRCREV = "3adff289617ed32f9d0cb679b05e430531cbf0dd"
S = "${WORKDIR}/git"
PV = "v1.1+git${SRCPV}"

REQUIRED_DISTRO_FEATURES = "x11 opengl"

inherit qemu-ext distro_features_check pkgconfig pack_audio_plugins

# TODO standalones: DEPEND jack / install / *.desktop
DEPENDS += " \
    virtual/libgl \
    ladspa-sdk \
    lv2 \
    projectm \
"

do_compile_prepend() {
    export NOOPT=true
    rm -f ${WORKDIR}/lv2_ttl_generator-data
    # manipulate scripts to keep lv2_ttl_generator-calls in script for qemu
    sed -i 's|"$GEN" "./$FILE"|echo `pwd`/$FILE >> ${WORKDIR}/lv2_ttl_generator-data|g' ${S}/dpf/utils/generate-ttl.sh
}

do_compile_append() {
    # build ttl-files must be done in quemu
    for sofile in `cat ${WORKDIR}/lv2_ttl_generator-data`; do
        cd `dirname ${sofile}`
        echo "QEMU lv2_ttl_generator for ${sofile}..."
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/dpf/utils/lv2_ttl_generator')} ${sofile} || echo "ERROR: for QEMU lv2_ttl_generator for ${sofile}!"
    done
}

do_install() {
    install -d ${D}${libdir}/ladspa
    for plugin in `find ${S}/bin/ -name *ladspa.so`; do
        install -m 644 $plugin ${D}${libdir}/ladspa/
    done

    install -d ${D}${libdir}/lv2
    for plugindir in `find ${S}/bin/ -maxdepth 1 -name *.lv2`; do
        lv2dir=${D}${libdir}/lv2/`basename $plugindir`
        install -d $lv2dir
        for plugin in `find $plugindir -type f`; do
            install -m 644 $plugin $lv2dir/
        done
    done

    install -d ${D}${libdir}/vst
    for plugin in `find ${S}/bin/ -name *vst.so`; do
        install -m 644 $plugin ${D}${libdir}/vst/
    done
}

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
