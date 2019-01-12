SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "781fe22c5c4bfabb9b32ffdfdc10168a"
SRC_URI[sha256sum] = "ef34a81fa3413c8052f8cb39d1b12c19489341bd83773af7ba3ffad195518341"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
