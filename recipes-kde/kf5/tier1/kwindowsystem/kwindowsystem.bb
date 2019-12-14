SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender libxfixes libxfixes-native", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f050441bbfceeec5509a94b543f7d8e2"
SRC_URI[sha256sum] = "9745aebe1d0fdcdede623b9a7cd55b86520e3122278a6c4f82ebb83e0cf514c2"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
