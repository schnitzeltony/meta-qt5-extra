SUMMARY = "A lightweight framework on top of the Qt scene graph"
DESCRIPTION = "A lightweight framework on top of the Qt scene graph and only few classes from Qt/Quick. It is usable from C++ and/or QML"
LICENSE = "LGPLv2.1-qskinny-exception"
LIC_FILES_CHKSUM = "file://COPYING;md5=ef112951de2dd97ead272458f5b86bdc"

inherit qmake5 qemu-ext

SRC_URI = " \
    git://github.com/uwerat/qskinny.git \
    file://0001-Fix-linking-for-all-examples.patch \
    file://0002-Do-not-install-to-usr-local.patch \
"
SRCREV = "84e19c43f800f1d05f23dcb855807e0159b8fa04"
S = "${WORKDIR}/git"
PV = "0.0.1+git${SRCPV}"

DEPENDS += " \
    qtbase \
    qtdeclarative \
    qtsvg \
"

PACKAGECONFIG ?= ""
PACKAGECONFIG[qtwebengine] = ",,qtwebengine"

SVG2QVG_CALL_IN_SOURCE = "$${SVG2QVG}"
QEMUCALL = "${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '')}"

do_configure_prepend() {
    for pro_file in `find ${S} -name *.pro`; do
        # wrap cross svg2qvg by qemu
        sed -i 's|${SVG2QVG_CALL_IN_SOURCE}|${QEMUCALL} ${SVG2QVG_CALL_IN_SOURCE}|g' "$pro_file"
    done
}

do_install_append() {
    # Don't not pollute /usr/include
    install -d ${D}${includedir}/qskinny
    for header in `find ${D}/${includedir} -name '*.h*'`; do
        mv $header ${D}${includedir}/qskinny/
    done
    
    # plugins are not yet used as such -> libdir
    for lib in `find ${D}/usr/plugins -name '*.so*'`; do
        mv $lib ${D}${libdir}/
    done
    rm -r ${D}/usr/plugins
}

PACKAGES =+ "${PN}-examples"

FILES_${PN} += " \
    ${libdir}/lib*skin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-examples += "${bindir}"

FILES_SOLIBSDEV = "${libdir}/libqsk*${SOLIBSDEV}"
