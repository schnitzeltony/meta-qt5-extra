SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c21c5d17d3acf80568950daf6bcdd1fe"
SRC_URI[sha256sum] = "36bbe524f5edd3b6c0549fd37b796c37e2a4d7fe7e819a0a40ce663f7e510956"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
