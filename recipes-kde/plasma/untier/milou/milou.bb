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
SRC_URI[md5sum] = "68f3bec27aa66de065cf2fb087d8bd95"
SRC_URI[sha256sum] = "d6472ca1ce2fb865a856c1b3008a5c8c385df3e9bbe991cb7f03bfc50f77abe0"

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
