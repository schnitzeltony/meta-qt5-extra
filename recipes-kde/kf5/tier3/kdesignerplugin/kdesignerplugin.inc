SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "079879839e1f6d7ba76c302f2cff11d0"
SRC_URI[sha256sum] = "52acbd888f4f79b1ed4481f752ed2a0f6cef81b40cecb9bd870572c8f9451a44"
