SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1f205dd6808ec92268537fdc3db077d9"
SRC_URI[sha256sum] = "3e033455d1dfcf96db091f2c47b9ac3370c36896baecfbc6833dea95a41c829e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
