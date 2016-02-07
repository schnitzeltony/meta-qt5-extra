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
SRC_URI[md5sum] = "277ad0f67e0b101d109e93a03902bf49"
SRC_URI[sha256sum] = "3bac1dfbc60ec57649954ce14c792143d0f2f3314cc6b8a502e4abe2d242ba34"

FILES_SOLIBSDEV = "${libdir}/libmuonprivate${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/libdiscover \
    ${datadir}/muondiscover \
    ${datadir}/plasma \
    ${datadir}/polkit-1 \
    \
    ${libdir}/libDiscoverCommon.so \
    ${libdir}/libDiscoverNotifiers.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"

RDEPENDS_${PN} += "python3"
