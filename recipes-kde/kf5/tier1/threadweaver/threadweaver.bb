SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e402f5d78ce5226503e89b8d061f42d3"
SRC_URI[sha256sum] = "a95ccaa7a51c9067efd393ba986044bfa76a4e16eaea94643aea236acd44a5ab"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
