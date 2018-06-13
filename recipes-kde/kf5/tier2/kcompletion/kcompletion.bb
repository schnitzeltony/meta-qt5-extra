SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "df53f0b2ca5d83e9eb2a6748a517ef4d"
SRC_URI[sha256sum] = "17001dcb7e036e248ab597ce14fc55f845faf59b9723de5b6d14a4b8c820bcf1"
