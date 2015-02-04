SUMMARY = "GTK2 and GTK3 Configurator for KDE"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

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
SRC_URI[md5sum] = "283896b01e1d0a2bacf45498aeffefae"
SRC_URI[sha256sum] = "712e1a3ff69059ddcc44eca2f7697c06d302bae276c7391ea9d23c5d56c64ebd"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kcm-gtk-module \
    ${datadir}/icons \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
