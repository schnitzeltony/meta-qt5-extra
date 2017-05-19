SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6fc0cd71f1c331aae78b0c03114958dd"
SRC_URI[sha256sum] = "312a3d76ba42d2b8f4e959f42e7dc1f33363529fb2279b76820d316cb2407441"
