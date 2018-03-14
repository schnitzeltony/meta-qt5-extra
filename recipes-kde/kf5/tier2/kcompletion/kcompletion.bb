SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "af8e7f43ef67c0b0c3b1f711ddf13058"
SRC_URI[sha256sum] = "44c1546558817b54ba247c8e86c40fc0263fbbd35fa02547e8eadede6d9ec2bb"
