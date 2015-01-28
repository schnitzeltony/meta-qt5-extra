SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde cmake-lib pkgconfig

DEPENDS += "networkmanager"

SRCREV = "e05ce6e7d5a39b44058ac54f8a399d0afdbffb99"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"

#FILES_${PN} += "${datadir}/k*5"
