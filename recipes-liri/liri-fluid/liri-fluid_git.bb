SUMMARY = "Library for QtQuick apps with Material Design"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE.MPL2;md5=815ca599c9df247a0c7f619bab123dad \
"

inherit liri gtk-icon-cache

PV = "1.1.0+git${SRCPV}"
SRCREV = "30423dadab9ce822e680fef2f2167560b6a76489"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
"

do_configure_prepend() {
    (cd ${S} && ./scripts/fetch_icons.sh)
}

# docs -> qdocs -> clang-native
EXTRA_OECMAKE += " \
    -DFLUID_WITH_DOCUMENTATION=OFF \
"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dev += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
    ${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs \
"

RDEPENDS_${PN} += " \
    qtsvg-plugins \
"
