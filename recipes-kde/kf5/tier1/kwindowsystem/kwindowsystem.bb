SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI += "file://0001-config-kwindowsystem.h.cmake-fix-path-to-plugins.patch"
SRC_URI[md5sum] = "294bcc6f70b12d3e4c1d1bc363ede9e6"
SRC_URI[sha256sum] = "a460f9d2a045c4fd8bb71578811caa93b1a39f04170adedc4164c71e8f290ba0"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

