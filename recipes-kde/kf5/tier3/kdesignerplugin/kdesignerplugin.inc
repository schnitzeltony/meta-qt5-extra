SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ba8603c7f6f3b3290e19f1f5d3fb3e8c"
SRC_URI[sha256sum] = "a30a8275f6c87168bc333d6ae91116d762b31d34b8774ad71057d268ddba698b"
