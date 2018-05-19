SUMMARY = "Collection of DPF-based plugins"
LICENSE = "ISC & GPLv2 & GPLv3 & LGPLv3 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=ec024abddfab2ee463c8c1ad98883d12 \
"

SRC_URI = " \
    git://github.com/DISTRHO/DPF-Plugins.git \
"

SRCREV = "6454c590a2b5402195e655b1386358210e067dfd"
S = "${WORKDIR}/git"
PV = "v1.1"

REQUIRED_DISTRO_FEATURES = "x11 opengl"

inherit lv2-postinst-helper distro_features_check pkgconfig

# TODO standalones: DEPEND jack / install / *.desktop
DEPENDS += " \
    virtual/libgl \
    ladspa-sdk \
    lv2 \
    projectm \
"

do_compile_prepend() {
    export NOOPT=true
    rm -f ${LV2-TURTLE-BUILD-DATA}
    # manipulate Makefile/scripts to keep lv2_ttl_generator-calls in script for lv2-postinst-helper
    sed -i 's|$GEN ./$FILE|echo lv2-ttl-generator `pwd`/$FILE >> ${LV2-TURTLE-BUILD-DATA}|g' ${S}/dpf/utils/generate-ttl.sh
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
        for plugin in `find $plugindir -name *.so`; do
            install -m 644 $plugin $lv2dir/
        done
    done

    install -d ${D}${libdir}/vst
    for plugin in `find ${S}/bin/ -name *vst.so`; do
        install -m 644 $plugin ${D}${libdir}/vst/
    done
}

FILES_${PN} += " \
    ${libdir}/ladspa \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
