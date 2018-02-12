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
SRC_URI[md5sum] = "b3092aca3e241329310ca2c57087a6c6"
SRC_URI[sha256sum] = "7c9016f2c98452d912359def78185f4bf3c6f8c45833fe0e321278124c45bbe3"

RDEPENDS_${PN} += "perl"
