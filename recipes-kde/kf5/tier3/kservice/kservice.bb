SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "75cb3119ee0a5e0bfe2b4c38a23e346d93dc465e"
S = "${WORKDIR}/git"

DEPENDS += "kconfig kcoreaddons kcrash kdbusaddons ki18n kdoctools"

CMAKE_HIDE_ERROR[1] = "KF5Service, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Service, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"


