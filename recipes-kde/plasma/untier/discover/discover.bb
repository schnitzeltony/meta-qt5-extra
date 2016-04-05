SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache

DEPENDS += " \
    qtsvg \
    qtdeclarative \
    \
    qca \
    libdebconf-kde \
    libqapt \
    \
    attica \
    knewstuff \
    plasma-framework \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "cef43f86ae5ab785afd9bf9ae7f84941"
SRC_URI[sha256sum] = "f9014903f64b1774c6c66ecf96089bb204edba4e999c2d9a40ae3e378cf3b566"
SRC_URI += "file://0001-application-backend-requires-AppstreamQt.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
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
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"

RDEPENDS_${PN} += "python3"
