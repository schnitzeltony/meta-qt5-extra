SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a72399f496b3813277e69477a56b98e8"
SRC_URI[sha256sum] = "f89a97e9501d841d4543249776783ebd1fc4d7f69e114f8a56027f59ad32000a"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
