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
SRC_URI[md5sum] = "5f36ce8b06f046d14309afba6307531d"
SRC_URI[sha256sum] = "b3acbce98798eb5fe897fae671b898697b5ffdd2e357aa8d4750305abeb9ee5a"

RDEPENDS_${PN} += "perl"
