SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "234017ec51e4dc3f02989af75121e8f5"
SRC_URI[sha256sum] = "38d1a89281341444c5c3615a4ccab0785f8488c2b6437a67b8a417a01aaea4c0"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
