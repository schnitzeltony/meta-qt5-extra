SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d560c5c583abe4741b1794b9108ee324"
SRC_URI[sha256sum] = "e58cfac780f7cfbdac9ff15ce32a1431d965a3319ddcd327d39edee7bf4e67ad"
