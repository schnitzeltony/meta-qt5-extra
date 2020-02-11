SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3242e4364f2f21980f208c1685019fd0"
SRC_URI[sha256sum] = "f95ce909892f588f468d6666b12b1a4e2cfc431dc5fcac0d574e408b1e3b26c1"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
