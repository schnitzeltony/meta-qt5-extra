SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6f2daf1b78a59e4475f363fad1f5122f"
SRC_URI[sha256sum] = "e3223f307e367223124ad140d9e8d52a3bb11a3de64c357ca1d220ae870c6ecc"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
