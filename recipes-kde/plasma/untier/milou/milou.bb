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
    kitemmodels \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3e5758ba200a007e62321f4c0139c05b"
SRC_URI[sha256sum] = "c311dd59744c01ebbacab3fb5049581a6f30e6f62374254b9f466a2edb3d8836"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
