SUMMARY = "Library for QtQuick apps with Material Design"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = " \
    file://LICENSE.MPL2;md5=815ca599c9df247a0c7f619bab123dad \
"

inherit liri gtk-icon-cache

PV = "1.1.0+git${SRCPV}"
SRCREV = "ec6f8d84d4290ce37e3c25aeb3ed1cc69cd222f1"
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
