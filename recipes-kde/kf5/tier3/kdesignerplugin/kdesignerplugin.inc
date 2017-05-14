SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "760797a5697383a23dc28c043776f6b7"
SRC_URI[sha256sum] = "50a9b3c2a58de0a94804d550e06e3d227dddbfa297133c0e76b2c1cccfcbcaca"
