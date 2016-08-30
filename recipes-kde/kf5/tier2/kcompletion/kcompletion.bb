SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ce3839d146dc522a3595085833bf10ea"
SRC_URI[sha256sum] = "6a8af0a084ce697f57382f16157b0c21e4287c809819611fb7e6171e7e149d4a"
