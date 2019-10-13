SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kguiaddons kwidgetsaddons kdoctools \
            kcoreaddons-native kauth-native kconfig-native kdoctools-native \
            gettext-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0ea84fd5439f4a66400900ca10321b7d"
SRC_URI[sha256sum] = "e577c68523721cbdbe2f019098f382cdcd4db4c805fb68d86c2b7d6fb76b1d25"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS_${PN} += "perl"
