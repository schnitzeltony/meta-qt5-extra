SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eafb575ee24c3d5856df5d0b5e97ad4e"
SRC_URI[sha256sum] = "341741abd0b8aeeec8a2a87fe781b4ec1ab593563b1c063cdfdccead3706cdd7"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
