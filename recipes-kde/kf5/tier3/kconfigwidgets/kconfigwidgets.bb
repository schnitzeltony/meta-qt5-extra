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
SRC_URI[md5sum] = "82d5d219494a2ad1514157a7064521d0"
SRC_URI[sha256sum] = "7fc65e3ccc3522a307d1e0baa4d51261c2d7d82fa40f9405de73d46332ce0cdb"

RDEPENDS_${PN} += "perl"
