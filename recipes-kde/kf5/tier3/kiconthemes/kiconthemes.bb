SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "37cb76fc6c41c66e90316b1e8caf3420"
SRC_URI[sha256sum] = "0c2f9bb7639f2febc98a150be07a7b00953ac58b2faf1f11646c07ebb0beacc4"
