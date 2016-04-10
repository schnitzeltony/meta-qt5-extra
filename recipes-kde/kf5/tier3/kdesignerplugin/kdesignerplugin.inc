SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1dfa4a67a038c4ae76b7def25eb9504f"
SRC_URI[sha256sum] = "5218a582e27ce8a31b3885cec7b6ca704aa0d628baf4aa32e5a0b2f65a4d4766"
