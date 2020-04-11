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
SRC_URI[md5sum] = "d9ea79fcc8d295c917730128a5b3cfd6"
SRC_URI[sha256sum] = "be70ed78ec4b82d96ce6fb573478a18042d14c46fb462bc571dc9b777cf63eb9"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
