SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "adbc56e452dca4a6c00ca70157d7d21d"
SRC_URI[sha256sum] = "1ca638ec822d9882f4a865d599ce8ad94785fa890ce73bccd5e78210c4a3d95b"
