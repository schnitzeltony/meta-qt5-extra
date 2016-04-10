SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "41743b94bdb0ede561a8adefc694586e"
SRC_URI[sha256sum] = "1312bd70a8dda09801887c0f5adaa3013f0ba2eb1960bf39f1a463f370d837c3"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
