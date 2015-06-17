SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5ffac7ee80aa144de5719cae044878b0"
SRC_URI[sha256sum] = "5ffca756f146825b5daaf1a29cec7947786cf967041c669dccd72c148cfdd9a8"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
