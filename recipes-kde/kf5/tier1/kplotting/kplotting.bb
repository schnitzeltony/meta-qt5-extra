SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9b2a7286c3576155037e2c1d7dc2dd0c"
SRC_URI[sha256sum] = "5445f5b8de641242ce29454e43c1758816d46acac21c2fe41b5f7777e2a200f6"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
