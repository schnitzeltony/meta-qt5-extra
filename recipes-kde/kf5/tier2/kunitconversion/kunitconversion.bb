SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8505e76f2e45febe316ab83ee31ece3f"
SRC_URI[sha256sum] = "b7972e35492f98658aa456a48902330c4c82ad7d08315ef626269b0e5f3cceb1"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
