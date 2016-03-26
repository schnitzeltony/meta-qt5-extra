SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "32400f7753597da9982c36e4ea8d88bb"
SRC_URI[sha256sum] = "ce9202716572ba2bf2f09633ea2f64961a698058ced2092665582b39306496d3"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
