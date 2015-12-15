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
SRC_URI[md5sum] = "e87f0fdcb7078d7b7976907fd0cc61f8"
SRC_URI[sha256sum] = "8e1ba18e0760eda6874d2874db8ccb5a93f3f5820b10f692ca88ac6e4440245b"

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
