SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "affc59e5e59b151d0dc9f1e95eb49da4"
SRC_URI[sha256sum] = "73e60b8498dcd2e9ed69370e7b6ff62869f0972c57306f0b3128c54c21b67ac0"

CMAKE_HIDE_ERROR[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

