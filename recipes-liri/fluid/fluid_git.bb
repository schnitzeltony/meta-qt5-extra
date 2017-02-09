SUMMARY = "A collection of cross-platform QtQuick components for building fluid and dynamic applications"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE.MPL2;md5=815ca599c9df247a0c7f619bab123dad \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "87d81835c38cd59dd4c717ec96ba79e32a7019ea"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
"

do_configure_append() {
    (cd ${S} && ./scripts/fetch_icons.sh)
}

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += "${libdir}/cmake"
