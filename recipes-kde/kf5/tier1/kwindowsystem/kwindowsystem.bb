SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e0d5afe02b4acb0c557f3309035706e4"
SRC_URI[sha256sum] = "60ccb0b94e91fc130f7b5d2dae0c6120ba06204ecbdb9cc013ec0e30b1ac5c16"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

