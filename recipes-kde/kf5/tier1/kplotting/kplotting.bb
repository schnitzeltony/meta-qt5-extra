SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0e9bad15e826d040a90648d2345a47f1"
SRC_URI[sha256sum] = "13c3e28d7e57f3e55da7e450b9c92fe4e9c3e4e87de249cf481b882154f75152"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
