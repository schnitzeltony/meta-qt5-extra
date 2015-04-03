SUMMARY = "A dedicated search application built on top of Baloo"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma

DEPENDS += " \
    qtscript \
    qtdeclarative \
    \
    krunner \
    plasma-framework \
    ki18n \
    kdeclarative \
    kservice \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b1a618f3887ee6b0ebe5edf5568a6261"
SRC_URI[sha256sum] = "d9fd5bc3a438affec9d4cc786a03929c7ed379d6cac22a920f1d9b0812d8e048"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${libdir}/plugins \
    ${libdir}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/qml/*/*/*/.debug \
"
