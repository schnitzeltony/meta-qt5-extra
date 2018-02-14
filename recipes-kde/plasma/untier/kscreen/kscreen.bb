SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += "\
    qtdeclarative \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    libkscreen \
    kdbusaddons \
    kconfigwidgets \
    ki18n \
    kxmlgui \
    kglobalaccel \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "742a0c2a5067f92a3a5f2a8299680972"
SRC_URI[sha256sum] = "02d68fc68724187d354a20c283c31097075e792c71c5029c97802749f67f60a3"

FILES_${PN} += " \
    ${datadir}/kcm_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
