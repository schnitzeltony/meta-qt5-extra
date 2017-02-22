SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fa2e0994412b83dbb0e54aa277f4bff3"
SRC_URI[sha256sum] = "25e3149ac3b34f9dac7077a27625928876345214b35b7af7e6eb435abf7e564d"
