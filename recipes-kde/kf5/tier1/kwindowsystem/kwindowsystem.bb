SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI += "file://0001-config-kwindowsystem.h.cmake-fix-path-to-plugins.patch"
SRC_URI[md5sum] = "dff4815d1ae67206329aa690c2a98dfb"
SRC_URI[sha256sum] = "2f8aac7a1c9002b8647f26ad556e3265a004cbd1055eff5be3769c02bc06141e"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

