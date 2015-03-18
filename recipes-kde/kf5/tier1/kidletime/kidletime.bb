SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fde983bc04c782b0151ff9686df7d77d"
SRC_URI[sha256sum] = "7ee7d58a6c999debd6582add8bc4def609c87a25456c09d345402fe1b2bed02e"

SRC_URI += "file://0001-Do-not-search-for-Qt5X11Extras-in-x-less-environment.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5IdleTime, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5IdleTime, -S${includedir}, -S${STAGING_INCDIR}"
