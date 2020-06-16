SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5adefc2992c4adcb749bee99fb10de60"
SRC_URI[sha256sum] = "3fa986207e9d967840bd7a3f1af1e4d0105905012a0e4cf56f7ef1b3740b3496"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
