SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "65da4c0f405fe373138e05c7fb7bd09a"
SRC_URI[sha256sum] = "bf191b760eb5de97e7a2cdda8c8a59d50597e46d7714510c1e1b20aa2baabe70"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

CMAKE_ALIGN_SYSROOT[1] = "KF5WindowSystem, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WindowSystem, -S${includedir}, -S${STAGING_INCDIR}"

