SUMMARY = "Add support for global workspace shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "7a614f29db3a0fbdcf6fe7ce2897c83ed505c11c"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5GlobalAccel, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5GlobalAccel, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1"
