SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a07bbaff1d102e1dfd58bcf328992fe4"
SRC_URI[sha256sum] = "a2549e56f1b5becf07785c7e11731501cb5ea7c30d5011865209838b550db18c"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
