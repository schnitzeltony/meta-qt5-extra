SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "67c2cf1f00f734d296d14810b1d15d30"
SRC_URI[sha256sum] = "679553eede9ac7db6cf83a99c871f4e3ef3ffdf5fc6ba2d8d2fa8be079738c7d"
