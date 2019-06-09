SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d2da32cde127ed7916dff9901d03af53"
SRC_URI[sha256sum] = "23d758648c44090b34d5852f45323a5efd7592a99dd260c4d59b97a809bdc0e5"
