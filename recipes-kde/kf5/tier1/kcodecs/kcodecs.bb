SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "55582ae9c6e021a23bb7c0f25329ea04"
SRC_URI[sha256sum] = "b08b419aaa1137083be32885afac8cfa7b3f1c3c874b5046e57c1f70cf0d3122"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"


