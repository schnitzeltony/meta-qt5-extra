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
SRC_URI[md5sum] = "1c3ef53c26083ccd886144d794f56b3f"
SRC_URI[sha256sum] = "8d68cf5618b7123a39e62a8ee52a01af7f95325b1d7b7bcac097c0d723c054c0"

RDEPENDS_${PN} += "perl"
