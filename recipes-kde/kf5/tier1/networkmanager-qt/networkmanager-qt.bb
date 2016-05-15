SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake-lib cmake-auto-align-paths

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ed7d579575915b0720293b7f7ed7224c"
SRC_URI[sha256sum] = "18d7da630efcbf7d9c00ca352f738f78a7ef92aa8d9f3b58e2f880402c08670d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5NetworkManagerQt, -S${libdir}/glib-2.0/include, -S${STAGING_LIBDIR}/glib-2.0/include"
