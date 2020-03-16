SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1b867e9b2f3bb3fdfd1d0a7864eabf2b"
SRC_URI[sha256sum] = "ae433e0eeaf0007312b1f32fc4349cf26c34617a5a9951ae4155c5c4e4009b72"
