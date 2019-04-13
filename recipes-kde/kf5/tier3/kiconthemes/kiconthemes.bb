SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a0812ab8df20b5e85cccd117378caa21"
SRC_URI[sha256sum] = "09abb03a97027948a1116bfb2ca9842d3f8fb2def83b0b02aaed194dd5bd16f3"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
