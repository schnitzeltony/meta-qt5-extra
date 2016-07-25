SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c37f92e09f9d2ab2420cb2abcddb46ca"
SRC_URI[sha256sum] = "080a72c619dc22599eeab11729b8607eee9f635a80efdcd817549b4a8995ae0d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
