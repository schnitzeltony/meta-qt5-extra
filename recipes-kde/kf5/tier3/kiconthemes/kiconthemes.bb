SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6dd429a363d483183393b0e77104f61d"
SRC_URI[sha256sum] = "055334138c964d61f8e11bbeb90286b3cd230c6856a801366e4f0e5fa65f5f01"
