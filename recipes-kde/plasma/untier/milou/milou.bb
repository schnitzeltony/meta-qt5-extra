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
SRC_URI[md5sum] = "b333e81ca010332df095286f353ede9f"
SRC_URI[sha256sum] = "5857081b91a6537d110608901b4eac4b0e8aa627f608a8b4d243f1c86fdf2d21"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/${QT_DIR_NAME}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/${QT_DIR_NAME}/qml/*/*/*/.debug \
"
