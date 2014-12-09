SUMMARY = "ntegration with su for elevated privileges"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	kcoreaddons \
	kservice \
	kpty \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

SRCREV = "392db480bcd24f2481299d19bbaaff5d6aeb27a8"
SRC_URI += "file://0001-kdesud.cpp-check-HAVE_X11-properly.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Su, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Su, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
