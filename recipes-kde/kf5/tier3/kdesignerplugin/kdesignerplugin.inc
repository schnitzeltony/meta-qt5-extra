SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9f7a117b0a32e0afe7b8516ad4fc4a5e"
SRC_URI[sha256sum] = "9bf43498f631dbf1c2bc15af7f6e6494d979223cf2a34ec9f95f58a7be57d816"
