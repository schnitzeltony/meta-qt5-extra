SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a03088f8e53b46169f959c7ff9df1bcf"
SRC_URI[sha256sum] = "2999af185dea2164b6943c9cabf2330e4cae4bea46863a1c3d66e86b04ffb618"
