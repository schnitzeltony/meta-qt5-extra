SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09b2d70bc7b505569a5fc9f35bfed3d2"
SRC_URI[sha256sum] = "e3ae79952ce7c3d1913d4ae30ed13026ca9f5b36139199e84f67a1bce4bcb6f2"
