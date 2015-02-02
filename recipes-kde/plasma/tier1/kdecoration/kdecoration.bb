SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde cmake-lib

SRCREV = "674aa454a3a345ef47eca24f513388c3694c5003"
PV = "5.2.90"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KDecoration2, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KDecoration2, -S${includedir}, -S${STAGING_INCDIR}"
