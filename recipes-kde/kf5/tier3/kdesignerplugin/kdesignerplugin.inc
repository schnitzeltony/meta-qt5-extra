SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "85f62f3cdedbbad16fc85f56c1cf980b"
SRC_URI[sha256sum] = "ee9c33c583caa1209b112119b2ba6c1f3c14f015b6bafd6e54c97acd8db1f9ac"
