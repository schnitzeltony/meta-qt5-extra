SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "21046d3e4a2a877ef3bdcf46feacc425"
SRC_URI[sha256sum] = "2b98e0fb3e674310c541fa1596895b4117b12404b347510c4f63a48f03e84d1e"

DEPENDS += " \
    attica \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kauth-native \
    kitemmodels \
    knewstuff \
    libdebconf-kde \
    libqapt \
    qca \
    qtdeclarative \
    qtsvg \
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
