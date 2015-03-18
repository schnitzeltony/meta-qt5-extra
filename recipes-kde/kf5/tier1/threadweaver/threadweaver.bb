SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "42a2e0afa725453e3773722e2a8c29a6"
SRC_URI[sha256sum] = "2c540bb37aafaa345c06c6d8469d3b70ba9427c202ebdfbc06c5b5994f8df039"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
