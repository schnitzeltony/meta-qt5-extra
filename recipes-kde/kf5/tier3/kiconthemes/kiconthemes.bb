SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fd90eda4d83598fefb87db83463cca1f"
SRC_URI[sha256sum] = "b8d48309efe3a5610483bad7d49ba9c30230e05c3db89b03aca0d2480fe43a5d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
