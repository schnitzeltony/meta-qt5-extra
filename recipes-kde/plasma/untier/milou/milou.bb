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
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6af5b0b7b481390f1dde1ad8528b8932"
SRC_URI[sha256sum] = "45890196e819f7488c1f146e685fcbf26ab298bb2a526e16ec2aae2f0238ed09"

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
