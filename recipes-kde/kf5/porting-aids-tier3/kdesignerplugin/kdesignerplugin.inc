SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d6723ac667a41ce3e845ac744ef0544c"
SRC_URI[sha256sum] = "e77a96c2a6cd518f3040e9366f013f0128200791b6c93c3c5b2310af16fb040b"
