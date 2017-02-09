SUMMARY = "A collection of cross-platform QtQuick components for building fluid and dynamic applications"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE.MPL2;md5=815ca599c9df247a0c7f619bab123dad \
"

inherit liri

SRC_URI += "file://0001-remove-Werror-from-build-flags.patch"
PV = "0.9.0+git${SRCPV}"
SRCREV = "db128f54be2c65b98bf32e5d60aa1b286f938bfa"
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
