SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8c5c4c6366999ebc72d32ed6eb88c1c4"
SRC_URI[sha256sum] = "9e85a4ac798122b459722773a6e81f639be6dfe9c9714a16704f555c88334393"
