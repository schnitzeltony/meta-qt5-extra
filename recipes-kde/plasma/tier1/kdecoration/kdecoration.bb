SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a83f26aff81a798929dd002e7b868c75"
SRC_URI[sha256sum] = "924f61e6a1191902622141ada6548cf44922d62fdd1b9b8d5277db456cf3b153"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
