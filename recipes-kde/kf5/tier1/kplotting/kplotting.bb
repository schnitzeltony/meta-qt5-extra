SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4acdf183309dfbee324dfae7f2169cf5"
SRC_URI[sha256sum] = "46b0d39298e6877c09c766e3a70f72a7aa6994c621674d630c5a35a656b622ec"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
