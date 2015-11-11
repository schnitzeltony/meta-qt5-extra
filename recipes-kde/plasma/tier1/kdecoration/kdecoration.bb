SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5a1aa0b28b3e8e870b46750898fdfd9c"
SRC_URI[sha256sum] = "38056c388568e65976e8579825f863eccf01e730c159c81f674d3d80ebd522d5"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
