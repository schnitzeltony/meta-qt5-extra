SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "39c8b31802d32fe59bc9487a542bdb18"
SRC_URI[sha256sum] = "68697be65d6c9e0053fc3e504170d23c3162c05a0a9027249c575bc6dc8bd3ec"
