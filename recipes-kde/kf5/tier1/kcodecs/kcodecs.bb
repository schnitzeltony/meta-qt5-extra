SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c33c270efadf19c86aa7058effb611ba"
SRC_URI[sha256sum] = "97d10cc6166b75da514c1d62f42226edccdcdae50fb65e76a2f02c7cab919e98"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"


