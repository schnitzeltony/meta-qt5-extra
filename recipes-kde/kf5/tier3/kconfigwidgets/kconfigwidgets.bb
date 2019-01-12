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
SRC_URI[md5sum] = "1a1abc37032b4ba98d371f40bd219416"
SRC_URI[sha256sum] = "617090206976f2434e76d0bec2d96b89aa7ff01d602f558ab5f57cfbf08170d0"

RDEPENDS_${PN} += "perl"
