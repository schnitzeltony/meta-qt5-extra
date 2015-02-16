SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bc01fc93692ca2d703e3a659e574163a"
SRC_URI[sha256sum] = "1262cd0411c962332006bce18c9d1bc5e05d5220be3d84b78b14d526cb20ce5e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"


