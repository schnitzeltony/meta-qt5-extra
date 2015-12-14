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
SRC_URI[md5sum] = "ca5920b3b3070cee296975047ad25a11"
SRC_URI[sha256sum] = "d53d33b8baf343a4f4d8ac36f01ed720ac62af620eb53c8f6c262169dc720576"

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
