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
SRC_URI[md5sum] = "e271bdcb47dae2819266494c96fbf01d"
SRC_URI[sha256sum] = "1d70a761eefe60e6f7beb3517ed64edbb6266cfe85bbb65603c9764e524b6170"

RDEPENDS_${PN} += "perl"
