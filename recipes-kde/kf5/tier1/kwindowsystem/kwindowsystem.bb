SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7bdb44810d27b2aabba382b9ff809c81"
SRC_URI[sha256sum] = "e8e7eebe02d17c9cc17a2b4e44f8ed78c4fca782bf5991900e77ad3c2f5a7359"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
