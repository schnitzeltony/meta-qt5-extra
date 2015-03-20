SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "098d15b2963526b2d5c5178bc4298fa0"
SRC_URI[sha256sum] = "9eb9a1b155c525121816d7fb06193971c5cafb5a414a3d82b86a7562e0832024"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
