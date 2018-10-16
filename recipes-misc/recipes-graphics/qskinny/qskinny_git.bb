SUMMARY = "A lightweight framework on top of the Qt scene graph"
DESCRIPTION = "A lightweight framework on top of the Qt scene graph and only few classes from Qt/Quick. It is usable from C++ and/or QML"
LICENSE = "LGPLv2.1-qskinny-exception"
LIC_FILES_CHKSUM = "file://COPYING;md5=ef112951de2dd97ead272458f5b86bdc"

inherit qmake5 qemu-ext

SRC_URI = " \
    git://github.com/uwerat/qskinny.git \
    file://0001-Add-installation-targets.patch \
"
SRCREV = "7d39d8dbf659c22b9c65cac13a3da4119ea4b293"
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

PACKAGES =+ "${PN}-examples"

FILES_${PN} += " \
    ${libdir}/lib*skin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-examples += "${bindir}"

FILES_SOLIBSDEV = "${libdir}/libqsk*${SOLIBSDEV}"
