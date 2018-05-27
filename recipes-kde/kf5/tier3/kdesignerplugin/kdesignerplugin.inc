SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6731356c0c86e9c706e58ce2cd621286"
SRC_URI[sha256sum] = "ca9ca83d741589e2e4fbfcf16973d3e81148d8558cfb0957d265f32af7a1bb87"
