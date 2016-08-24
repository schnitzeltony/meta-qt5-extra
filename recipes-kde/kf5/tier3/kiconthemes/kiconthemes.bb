SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "45eb7f6ad57eca1f2f5ad3d58a56bef8"
SRC_URI[sha256sum] = "dfea9b4da835c028b62faec6550d279a3a75874ff88d996d2b603be4f9b228b5"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
