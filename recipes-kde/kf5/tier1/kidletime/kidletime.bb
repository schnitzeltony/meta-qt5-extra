SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f87b44e5acd0c3a0ec891450a11f6c2b"
SRC_URI[sha256sum] = "0c0bd1ca3e028b5e78a5c3d2313aa24d62ddbe66971c41ac3a81e9033091fbe6"

SRC_URI += "file://0001-Do-not-search-for-Qt5X11Extras-in-x-less-environment.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IdleTime, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IdleTime, -S${includedir}, -S${STAGING_INCDIR}"
