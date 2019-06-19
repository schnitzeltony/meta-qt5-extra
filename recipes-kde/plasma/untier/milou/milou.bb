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
SRC_URI[md5sum] = "3e504f7b66d3cc430473662478915a74"
SRC_URI[sha256sum] = "e99556b7253ee3719b980adfe7481c9111741fb79e1b60f7b99679bb2bdbf788"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
