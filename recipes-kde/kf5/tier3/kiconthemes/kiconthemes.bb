SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1f98c26216b7ef6507d16815a69ffec2"
SRC_URI[sha256sum] = "2903b8ad05c6a0d115fc8c4accdb5fb8541ea05e69a9b70362cee3dc86bb7825"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
