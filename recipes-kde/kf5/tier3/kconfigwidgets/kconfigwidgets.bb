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
SRC_URI[md5sum] = "295ec19de064d7ce1e0d5a89b8a21fbb"
SRC_URI[sha256sum] = "7b0a87f74462adf9738a41599c63f8fb044a5f955420c74a71274ee582a4fe2e"

RDEPENDS_${PN} += "perl"
