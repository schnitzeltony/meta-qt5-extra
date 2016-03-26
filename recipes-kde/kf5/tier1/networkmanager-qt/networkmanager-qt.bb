SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake-lib cmake-auto-align-paths

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f25b6f54c7728fc0fb031f01065014f9"
SRC_URI[sha256sum] = "e59ef220780b1152342fb6d6d4b5c93021661d38e27f64e53f7fb8a4342cb8f6"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5NetworkManagerQt, -S${libdir}/glib-2.0/include, -S${STAGING_LIBDIR}/glib-2.0/include"
