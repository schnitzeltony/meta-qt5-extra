SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib pkgconfig

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ccfb2950c7ae9a1022aba4fa4eb5d5a2"
SRC_URI[sha256sum] = "5159520ffbf1540ed685fd47adaa35bd8f48008208269a2cac4c5a37dc1ae7f0"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
