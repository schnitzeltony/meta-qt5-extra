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
SRC_URI[md5sum] = "3669c0bb7c7b9edd908b4683e091602e"
SRC_URI[sha256sum] = "349ccd412fbe7130026e389edc6d1186ec0a1610dfdd43fd9ff00867ba50404e"

RDEPENDS_${PN} += "perl"
