SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kcoreaddons kcrash kdbusaddons ki18n kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "97f50a98baf0464612e9346b0196d8e5"
SRC_URI[sha256sum] = "4a8ad09c9d5cf44bead302c0ea0a1b4ca749ff9f67c3c11815c0832c36f3f1ab"

CMAKE_HIDE_ERROR[1] = "KF5Service, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Service, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"


