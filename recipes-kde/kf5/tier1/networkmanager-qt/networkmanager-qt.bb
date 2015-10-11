SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake-lib cmake-auto-align-paths

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6bb0d1877e42c4d477e6d05185397df0"
SRC_URI[sha256sum] = "178df9bc4d84cdc9e4d97e1435d42575530f38f2e78e01c36e9d3f9798490350"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5NetworkManagerQt, -S${libdir}/glib-2.0/include, -S${STAGING_LIBDIR}/glib-2.0/include"
