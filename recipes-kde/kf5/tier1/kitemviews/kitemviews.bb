SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fabb150da1ca12c8bb63981b2cff84a0"
SRC_URI[sha256sum] = "cd790904c36c4ff61e4311765a83b5ee2f62f4d1afe328439b2295baccf03ed3"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
