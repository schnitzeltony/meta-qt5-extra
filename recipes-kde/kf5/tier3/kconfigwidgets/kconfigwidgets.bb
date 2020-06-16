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
SRC_URI[md5sum] = "c8b8a63018f367d357d757eefd0ba219"
SRC_URI[sha256sum] = "5778523c49a5294e9376ce8ee6db1a51ffaa506418a19e8632f73287a596276f"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS_${PN} += "perl"
