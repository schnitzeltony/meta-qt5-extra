SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2ed7f444fee9475a9c10f55df000828b"
SRC_URI[sha256sum] = "54c833a09f1b9d117ede26b9ec5d069b84b7304ace6a173c7fd5470d849d2d29"

