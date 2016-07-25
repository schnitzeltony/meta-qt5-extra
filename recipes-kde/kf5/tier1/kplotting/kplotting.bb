SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5e3d90a28ed3f2cd61a2cff93aacb850"
SRC_URI[sha256sum] = "42f9f3e22c23effe53ebaf4fa73febcb8e7942a8c3dfc39ad165113813befe3e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
