SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9294daf98d59156d3aa975a54f9e2603"
SRC_URI[sha256sum] = "52586f6524eace88b09500d0e2e8fde0a2a06f69c4f65cd0791423fa076a8881"
