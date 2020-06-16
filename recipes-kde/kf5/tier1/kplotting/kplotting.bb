SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "95a2891975e6e1accca16b089b4f3464"
SRC_URI[sha256sum] = "84bacfbd86105e454f3d97f4ac4062e2f992556fca66d2c73806d1d12095bec1"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
