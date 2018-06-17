SUMMARY = "Framework for creation and generation of reports"
HOMEPAGE = "https://community.kde.org/KReport"
LICENSE = "LGPLv2 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1634220ce20ef95161c3b8401908638c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps

DEPENDS += " \
    kproperty \
    \
    kcoreaddons-native \
    kcoreaddons \
    kconfig-native \
    kconfig \
    kwidgetsaddons \
    kguiaddons \
    \
    marble \
    qtwebkit \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "48216d8f83a48c93bed9acd0081daa92"
SRC_URI[sha256sum] = "3b6485629b5e4343b7ddf42efb1927310d60b143a22afe79925147d0ddcdf36c"

FILES_${PN} += " \
    ${datadir}/kservicetypes5 \
    ${datadir}/kreport3 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
