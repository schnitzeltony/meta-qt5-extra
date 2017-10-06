SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "06037de8697f4ca4c2666cedf74bc3e4"
SRC_URI[sha256sum] = "5c943799729e7ed8d101eb2e11a09a2616d6c13c33d3575b2e61667e0c2f2539"
