SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9e03c83e412caf74b42949393665b533"
SRC_URI[sha256sum] = "76849708e7e95eb051d4d2ebcddd0424f99d2ac9658204eceab0f5be51777498"
