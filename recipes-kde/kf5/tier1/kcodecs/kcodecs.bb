SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2ac5466d18ee4fc525a129eaac028c33"
SRC_URI[sha256sum] = "2bde34994b7c80bea15339110f7e784bd96c0077dae08e1c914cbc027f3e3af8"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"


