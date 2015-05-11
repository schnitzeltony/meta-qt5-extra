SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "65d219e91ad1a4733e1fc5899c884a4d"
SRC_URI[sha256sum] = "06570a3c371837e9d50c779c7acdb6508d6b2c93b66eb1251504f998bce6c3b0"

CMAKE_ALIGN_SYSROOT[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

