SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1d9b3568bd01c9f67c0575eb3e990413"
SRC_URI[sha256sum] = "a30c350ae511e5e9c27b44372d02f11d6afee48e7781ce1685895bbdfeca1cfa"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
