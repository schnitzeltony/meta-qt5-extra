SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "45edbcf24f65f17f6d00860ae77cbc1e"
SRC_URI[sha256sum] = "906f480e181ee31a141e9e9b839d084f17800657faf639d8b5c5ec250c18adf7"

PV = "${KF5_VERSION}"

CMAKE_HIDE_ERROR[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

