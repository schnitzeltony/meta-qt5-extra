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
SRC_URI[md5sum] = "3642053ec1d3ab865926c505bf04de2d"
SRC_URI[sha256sum] = "ff40fd6d48815c39e46e19eadf4048f04e79f34f7522a9ba655e6d4a1690546e"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
