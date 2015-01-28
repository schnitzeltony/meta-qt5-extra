SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "b20cb5e162702cf6e6d99304bbf1ba6192f29f40"

CMAKE_HIDE_ERROR[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

