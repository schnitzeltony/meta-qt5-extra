SUMMARY = "A collection of cross-platform QtQuick components for building fluid and dynamic applications"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE.MPL2;md5=815ca599c9df247a0c7f619bab123dad \
"

inherit liri

SRC_URI += "file://0001-remove-Werror-from-build-flags.patch"
PV = "0.9.0+git${SRCPV}"
SRCREV = "554a83ea46ff1db9c11f89654777911f984c6b16"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
"

do_configure_prepend() {
    (cd ${S} && ./scripts/fetch_icons.sh)
}

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += " \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"
