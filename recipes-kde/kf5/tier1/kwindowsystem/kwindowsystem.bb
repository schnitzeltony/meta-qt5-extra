SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ee0dd6e2c3c121b4f8924122c5ea6472"
SRC_URI[sha256sum] = "6c51e7f24be7323caad08bd3ebea2fd941c1b185e9cd2c740a2b887eac98e1e3"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
