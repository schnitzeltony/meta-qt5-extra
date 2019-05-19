SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2111f28ff4051914be2b7caf355befb4"
SRC_URI[sha256sum] = "ec12602159b7115c91b30373321ab631f75b12f814769166b4ee2e3abd83c480"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
