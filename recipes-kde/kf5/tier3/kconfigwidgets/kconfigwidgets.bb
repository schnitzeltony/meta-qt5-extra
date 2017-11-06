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
SRC_URI[md5sum] = "6e3d4a86acf2aba135983d850e0958e1"
SRC_URI[sha256sum] = "fc77a295823327aa602d246f2e7da8094f5a97d56c1d69916e3ad9aa71b4ccc4"

RDEPENDS_${PN} += "perl"
