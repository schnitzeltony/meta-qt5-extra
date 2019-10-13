SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09b629c9a9488cc43e6a2387726aec7d"
SRC_URI[sha256sum] = "c9f63d672cbc04465e77eff07d62530e8f9a9129e0d6dfa7e13e0ad4bea6eff0"
