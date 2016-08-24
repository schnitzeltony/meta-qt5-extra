SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ae52891201ea66b15d94a4f5a2717a5f"
SRC_URI[sha256sum] = "b8228dddcc6487e234f81239bea7ca7ae261af8fef7b9e5d7a8b49aa3ac5d0dd"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

