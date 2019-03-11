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
SRC_URI[md5sum] = "7f5ba2cf7ef7190c554d24967848a4a1"
SRC_URI[sha256sum] = "c5cfcd8ba356563d83c11a2ebe78d163336df2ef3f97faed0f487ddc5f67a503"

RDEPENDS_${PN} += "perl"
