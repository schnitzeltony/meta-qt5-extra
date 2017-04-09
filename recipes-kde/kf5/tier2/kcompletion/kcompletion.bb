SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d69919f85b6a3b8d8d6d12df2bea2263"
SRC_URI[sha256sum] = "11d2244253d64b9752eba1d4dc60155d5da0443ecd58024d99644b906a2dbb8e"
