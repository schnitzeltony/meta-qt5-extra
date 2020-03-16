SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d925109fecd89284b7c6968cbee23c2c"
SRC_URI[sha256sum] = "ac3f322f2644dd0468cd2b07cc0c7f853f1ac4bc714fe532bbe92e88141f6729"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
