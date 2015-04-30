SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma

DEPENDS += " \
    gtk+3 \
    ki18n \
    kconfigwidgets \
    knewstuff \
    karchive \
    kcmutils \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "aab58003cc7011ddfdb6d93803327fc8"
SRC_URI[sha256sum] = "8ec14b07880fdb9029e29439e83ab365cda5db3d0fec6219e00a9433569ef2e8"

SRC_URI += "file://0001-fix-for-gtk2-only-and-gtk3-only-environments.patch"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kcm-gtk-module \
    ${datadir}/icons \
    ${libdir}/${QT_DIR_NAME}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
"
