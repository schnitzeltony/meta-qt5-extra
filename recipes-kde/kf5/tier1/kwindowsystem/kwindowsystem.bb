SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "abc30887409acf05d1e6e22f1c3b98e8"
SRC_URI[sha256sum] = "c5a8845c0252a57f4fdc6e3a58304107631343f64ca619788adf197d7f578aa5"

CMAKE_HIDE_ERROR[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

