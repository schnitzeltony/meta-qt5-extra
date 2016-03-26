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
SRC_URI[md5sum] = "fba2776f99c139bb64c731f092687b72"
SRC_URI[sha256sum] = "e517d26e6df7abd05edfeb6f42dd507f02da25c5d4018473f5084c50b81a0477"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/*/.debug \
"
