SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d73e7e323009f920810cad7dde2d1d6a"
SRC_URI[sha256sum] = "1e8766cdafaaaa5a232b0f57279c570abcba01120d16051a93b412ad4cb29e73"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
