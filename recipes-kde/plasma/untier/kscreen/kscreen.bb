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
SRC_URI[md5sum] = "1c3c53d350a9427cde77b8cba77a533c"
SRC_URI[sha256sum] = "501c513b38ba0dd3b67f2d38615db67a5a7831e191e461d52b022589492a5e66"

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
