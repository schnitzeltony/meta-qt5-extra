SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e4a9229d95ae7ebaa094d104eb8bc633"
SRC_URI[sha256sum] = "c3c2248b82aae17ff14b5c64ffbee40f5418450a26baa9f8fab3110ae88d7895"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
