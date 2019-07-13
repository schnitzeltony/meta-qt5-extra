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
SRC_URI[md5sum] = "3a2876bcce59ee0ee3a002223e968d69"
SRC_URI[sha256sum] = "74ad4cf5b2858955e7966bb27f7b7ec38c6ddc7c95aa10ba356ef5775afeede3"

RDEPENDS_${PN} += "perl"
