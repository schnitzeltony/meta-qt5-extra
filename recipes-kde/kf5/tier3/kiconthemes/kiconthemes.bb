SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "178cd3cee51d06fed9bb3bae9a43ee1e"
SRC_URI[sha256sum] = "6549774254705861654e0393ab53b7a06b62415644d6bbe5479f7458b22895c5"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
