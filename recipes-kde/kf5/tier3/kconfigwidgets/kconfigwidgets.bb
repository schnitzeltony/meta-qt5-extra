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
SRC_URI[md5sum] = "70b60633d49d27020d26ec475d914917"
SRC_URI[sha256sum] = "ec26801097f5ea81611f1830c7cbca77e84d5ece0ea7526d967d1e3371490de9"

RDEPENDS_${PN} += "perl"
