SUMMARY = "A dedicated search application built on top of Baloo"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtscript \
    qtdeclarative \
    \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    krunner \
    plasma-framework \
    ki18n \
    kdeclarative \
    kservice \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8c6a1a50067af278932da0ce02fd43e8"
SRC_URI[sha256sum] = "b43fcd3a09cc13f73fab6ab0f3315338a000fdc6ac3e1813044c60c23ed4b89b"

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
