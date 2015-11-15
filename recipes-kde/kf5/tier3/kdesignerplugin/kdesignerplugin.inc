SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb82ede19ee124b1ed6fb9802de22ae3"
SRC_URI[sha256sum] = "c5a463a850c1830dbe92455b0595bad4797c434adb424e5a65d36f6fc16953f4"
