SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "01ce1c8a53bb864288b56454da236296"
SRC_URI[sha256sum] = "eaaa4ba735810728532f87afc835184c1372b94df3dc3374b64f50ca150262a9"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
