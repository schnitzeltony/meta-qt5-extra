SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b96b2eab04f75ec34b2017ca95d5a16"
SRC_URI[sha256sum] = "c80a88a525c25fb699412e5c4a4a142ae388ab056aa826a9f5433e78da9c6e6b"
