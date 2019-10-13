SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "463b86377fb354f3fdc279583fde98ef"
SRC_URI[sha256sum] = "dce004b5a210b7a96e78533909cb91ed2168534ae6303499f0777ac8c8b5e4a2"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
