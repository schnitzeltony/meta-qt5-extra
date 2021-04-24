SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "4307cd1c3bb681ec1c28cb4399ef952a1966273963f6511eb0b6256d9791f6e5"
