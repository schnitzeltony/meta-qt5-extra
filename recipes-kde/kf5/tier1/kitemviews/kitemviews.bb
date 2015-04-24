SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0c33d00216c03c058b832e92b6c0fe64"
SRC_URI[sha256sum] = "1a5d54116a1119024824778e297062e945f336cebeef7c0deb1590c922f3d577"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
