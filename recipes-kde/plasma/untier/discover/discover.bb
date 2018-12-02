SUMMARY = "KDE and Plasma resources management GUI"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e14211fc2b0d995d3cf142168056c144"
SRC_URI[sha256sum] = "d172ce8a5288e64920512a975985382e09c202b454633ffd88fedfe785f63b5e"

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    attica \
    kitemmodels \
    knewstuff \
    knotifications \
    kirigami2 \
    plasma-framework \
"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/libdiscover \
    ${datadir}/plasma \
    ${datadir}/plasmadiscover \
    \
    ${libdir}/plasma-discover \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${libdir}/plasma-discover/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"

RDEPENDS_${PN} += "python3 kirigami"
