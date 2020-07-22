SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e68dd94041f1791d1508f06d52811ca7"
SRC_URI[sha256sum] = "55e45a77ddea27fb0f0d130e2f568540443e04e454c1f1a7b746bef5a782f989"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
