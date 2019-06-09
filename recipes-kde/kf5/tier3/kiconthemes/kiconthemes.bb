SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6d74b625d3abcccaac6d0b3cfc562874"
SRC_URI[sha256sum] = "f0ce809c4955fa3c4643d7fa2b2d9c3fe0cbddd52082d94f798b4567be82dc38"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
