SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b8c97ce2663ea514104458cd8345b400"
SRC_URI[sha256sum] = "a667bd28575ba4462ed365ce3ea7d35e3f86b20e6fc034365914949205ee0588"
