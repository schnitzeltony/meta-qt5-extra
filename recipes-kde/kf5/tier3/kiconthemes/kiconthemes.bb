SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c75757aa9fbd5cab563ce90885126c74"
SRC_URI[sha256sum] = "02e3cbe74556f34eac730b826ab87998cd42ab11bc0437588f2ceb348dfd3f2f"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
