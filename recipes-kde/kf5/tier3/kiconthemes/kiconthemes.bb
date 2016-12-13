SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "979a480ddaef14b9f2caf85d726292ad"
SRC_URI[sha256sum] = "b01cd2eb5a7e2cfdf611e343bbbfdacdcd98c47904a132ba9a0bd65dcf36b225"
