SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "398b9dc09d1ee9b9efd943058b3c7f6e"
SRC_URI[sha256sum] = "f30f23a75498d41abf262dd3fab5cebb0ceea5353d57ad5113ccc2e1bb5ea6aa"
