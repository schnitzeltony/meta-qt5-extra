SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b7d9f5632cf52c65e29ea8be533327d"
SRC_URI[sha256sum] = "fb0c214271fae075347de7817634d1c6f14e4d208a93277464ccefca438621b5"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
