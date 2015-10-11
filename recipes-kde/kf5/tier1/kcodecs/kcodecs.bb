SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2cafea53c814ee47313805e98422b832"
SRC_URI[sha256sum] = "f71c51f064fdfde2b6eeb898aaf1f651c407e91844306359a7c07dbafadae8cf"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"


