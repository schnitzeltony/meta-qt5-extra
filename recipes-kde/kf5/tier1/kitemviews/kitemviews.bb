SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5810af01c1d53f4ef2cf9093c6c13dce"
SRC_URI[sha256sum] = "7121d989e1d649e90a38f25079de094b289ca4a64aee8847171ec723d3893036"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
