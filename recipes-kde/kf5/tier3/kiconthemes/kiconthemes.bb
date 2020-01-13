SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0fd8ffe9979e85b5fea75f4a507c3b4c"
SRC_URI[sha256sum] = "93fa9b8d0f951c2c9991f366081f98670086f2b66a740d7be95b64c35dff111d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
