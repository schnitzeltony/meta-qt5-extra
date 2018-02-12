SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ca000f985de0be2bb3c602697d1bb923"
SRC_URI[sha256sum] = "4df6da4f313f8c52a5d202caa5cc90791b4a07f0d91d5b7252e2da5487a6997d"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"
