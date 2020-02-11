SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "923482f22930286d7f99af334c3a2181"
SRC_URI[sha256sum] = "0b0924dad7bc9cf87a7589dc3bf35a928177dd79e7bce2430193431972c5fc28"
