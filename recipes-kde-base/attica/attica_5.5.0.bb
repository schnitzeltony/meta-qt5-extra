SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde cmake-lib

SRCREV = "59a419adc1ba6ee9aaff64a176b3f3829930a73c"

CMAKE_HIDE_ERROR[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

