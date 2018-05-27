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
SRC_URI[md5sum] = "cb263a59b6750f30dc219523873e9dd7"
SRC_URI[sha256sum] = "770d7ed6d75a64b271c36f022f8a692a26eac82bc2ed908293327b2387189d34"

RDEPENDS_${PN} += "perl"
