SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "3b4b45a3e250cec426890735089c7fcf"
SRC_URI[sha256sum] = "9b06375988eadf67da3c22c9c434adcaddfcadadff161fafee1a3327b6957b31"

PV = "${KF5_VERSION}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

