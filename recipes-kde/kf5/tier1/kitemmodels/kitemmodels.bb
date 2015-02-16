SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f4be5065077ba4fe7310ce9fa0a8cb46"
SRC_URI[sha256sum] = "f0d2a736acac531ad6f06c1abf36c68bf448e8a663fd32c2ce1610988f8e7f78"

CMAKE_HIDE_ERROR[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

