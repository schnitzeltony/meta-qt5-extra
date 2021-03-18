SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "43e36e8ba3b0c9d84de2359c89ee332f96e6cbf7cfebd4bc81b9d9e3c7c3e9b4"
