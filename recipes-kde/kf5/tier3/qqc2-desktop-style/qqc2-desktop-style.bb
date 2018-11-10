SUMMARY = "QtQuickControls 2 style that integrates with the desktop"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL-2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL-3;md5=15d6edab0fdf34fa80484687e7319ce2 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kirigami2 \
    kiconthemes \
    kconfigwidgets \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0aad32d67d7a3e9d6a7897167ba0918c"
SRC_URI[sha256sum] = "2ee8a3b3a50b2d8a71e097dd9f687ace823dca05acb30595b9bb88cb473b10b7"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
