SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6790087dd73139a6e21e3cdf663271e5"
SRC_URI[sha256sum] = "715d5d1f75fdd64458aae6391ca288d743c2b98043d418c846b3d98f2d377999"
