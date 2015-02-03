SUMMARY = "Addons to QtGui"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRCREV = "d7f3fdcb23c64b81f1ca86c64884988d760c3c36"
S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "KF5GuiAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5GuiAddons, -S${includedir}, -S${STAGING_INCDIR}"

