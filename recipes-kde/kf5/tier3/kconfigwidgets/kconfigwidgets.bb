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
SRC_URI[md5sum] = "ee1cf04225a7478a94442c9b4ee52224"
SRC_URI[sha256sum] = "4cc1e55c5f994abbec03b32bef73bdf54c2613199a446ad63f4ced6e3a0e2165"

RDEPENDS_${PN} += "perl"
