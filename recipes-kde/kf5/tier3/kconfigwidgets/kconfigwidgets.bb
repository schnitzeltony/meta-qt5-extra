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
SRC_URI[md5sum] = "3e1bddd47524d52b416a5f82c787eba9"
SRC_URI[sha256sum] = "bfa73d28d33397c91aaaac71809c21933f0e0194deba3d3c3ad78decede1ada4"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS_${PN} += "perl"
