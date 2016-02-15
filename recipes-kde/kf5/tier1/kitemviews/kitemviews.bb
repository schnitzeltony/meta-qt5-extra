SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ab98c10a12f67c437a8918ebfcf1ac80"
SRC_URI[sha256sum] = "56f632a57b874abbbb86666877c9b55ca4dd15aa612d03e85edce55d0dd91f85"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
