SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8ac6b08151029fc148473325c90c8b4d"
SRC_URI[sha256sum] = "7e3c683e46852ddbfc0a20334f3a41d733fe220dddad8b01de7e92d150552b46"
