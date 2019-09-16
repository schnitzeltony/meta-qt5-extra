SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dea00dd84977b5dade34f5882768e323"
SRC_URI[sha256sum] = "b5c0769d0b1df99f456c3c6f22a48e8bdf9c15f00be2e0795ae5bc5170596e47"
