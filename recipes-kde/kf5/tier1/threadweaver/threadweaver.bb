SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e7bec854878b5e1a874999691ff2ed19"
SRC_URI[sha256sum] = "0b0149b857ef161dc3934f2ffdfac017f9d9a8c783bd8f76c176584466815cf7"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
