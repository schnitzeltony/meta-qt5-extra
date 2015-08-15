SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9de370faf78290dbb7faecb4f8f70f73"
SRC_URI[sha256sum] = "aa51252bcab824de9edd7851f9e03ac987630a38c5f454b9d09d5c0daad696ad"

CMAKE_ALIGN_SYSROOT[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

