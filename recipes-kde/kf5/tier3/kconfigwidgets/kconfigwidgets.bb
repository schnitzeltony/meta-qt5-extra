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
SRC_URI[md5sum] = "676fdcd53f6a5b43a729881304c3fbbd"
SRC_URI[sha256sum] = "771c5641a9ae465feaf00ffbb3f3c0433ad8d4a90355dc50d5b6b1b472912eb0"

RDEPENDS_${PN} += "perl"
