SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eb20c5371306630b8c480adac760ac80"
SRC_URI[sha256sum] = "af0d7e80fa2c0c815d9a67c3be0999c44f6f43f9fdccdd902fbed6a5b0bbc516"
