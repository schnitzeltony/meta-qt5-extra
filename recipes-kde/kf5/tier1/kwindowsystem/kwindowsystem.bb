SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4db7723226f6b0e0d8705d3fe53642a3"
SRC_URI[sha256sum] = "d7390eca239f42033af9ebca5e3b7f2987dc605c34844ebce70a362b33ffb99c"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"
