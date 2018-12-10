SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1d4e9805bb6d3748b01140fdb0ecff41"
SRC_URI[sha256sum] = "06a3038e163e0c690d3be0c8636d033cc4e7bf9bbd5c5f6bb5f54aed6fd51ed4"
