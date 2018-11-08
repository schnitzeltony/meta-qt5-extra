SUMMARY = "KDE and Plasma resources management GUI"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a800bdba7e8f80abad003eacfb581e9c"
SRC_URI[sha256sum] = "64621972d5baccf3ccbafdd064811dbc5a909cf0c7f354c886b5608fcc35fd8b"

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
