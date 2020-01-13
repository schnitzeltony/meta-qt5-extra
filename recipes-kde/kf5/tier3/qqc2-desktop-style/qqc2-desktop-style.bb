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
SRC_URI[md5sum] = "bc27f9665b1a0479815ba0867d0a5669"
SRC_URI[sha256sum] = "49bb518fc9f3c08cb330b1d82cb5c68d9ea358a562c6e460ea06aaaa13812b87"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
