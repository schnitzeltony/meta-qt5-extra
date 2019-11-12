SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "53889e7526d0a4e389523545bccf1d88"
SRC_URI[sha256sum] = "4fe5b9254e038e654d55167163b2812582f31fe550c977979d692b69424c2508"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
