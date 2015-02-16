SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6abf99054b392606e4290a24277dfb13"
SRC_URI[sha256sum] = "3a12803dea3a91a2f02eaac99bba38f2fbbf78d96f699cd3330de021561310ba"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
