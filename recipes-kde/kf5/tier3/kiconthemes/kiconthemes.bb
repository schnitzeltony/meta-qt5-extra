SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "46d14353205a2f91a25a0bd9d2fbae7d"
SRC_URI[sha256sum] = "054bfdb9129ae8610cad742198e2ad047f3960f810b8153dc28ead76687d9e79"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
