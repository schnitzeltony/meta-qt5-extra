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
SRC_URI[md5sum] = "1afacb5ccde3eceb42774d5f717ece63"
SRC_URI[sha256sum] = "d334f86d5751cd4c04943b5104f3e62db1ed3ed64bc095391807b814ca51fd16"

RDEPENDS_${PN} += "perl"
