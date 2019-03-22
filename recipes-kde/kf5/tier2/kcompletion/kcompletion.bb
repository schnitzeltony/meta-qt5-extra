SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8f5717c167558618c0fa62504f4204af"
SRC_URI[sha256sum] = "49dbfda63c64724ecff40032c1631a7c7b84a8c551401a7547fa12e100cdbafb"
