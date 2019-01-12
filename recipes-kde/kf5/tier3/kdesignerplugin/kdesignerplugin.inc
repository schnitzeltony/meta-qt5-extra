SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ff70aa0bb1941322580a843a2a22df09"
SRC_URI[sha256sum] = "eaa19ffbe0af34ae8e132048cd4d78689e9a46c711f7b022dccbb4d1bee59e42"
