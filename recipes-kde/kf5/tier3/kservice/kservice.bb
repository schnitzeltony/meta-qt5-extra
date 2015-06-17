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
SRC_URI[md5sum] = "fe3138bc70494f0da6e6ea6317141860"
SRC_URI[sha256sum] = "9234831923fc73fd4b8e7edd012e2776e7140fb37a215cc1894e66779d502a34"

CMAKE_ALIGN_SYSROOT[1] = "KF5Service, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Service, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"


