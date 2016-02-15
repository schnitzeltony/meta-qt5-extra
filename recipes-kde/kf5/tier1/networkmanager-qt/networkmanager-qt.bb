SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake-lib cmake-auto-align-paths

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "327dc9c1ec64e59357545e842d29e5da"
SRC_URI[sha256sum] = "2360bd477a055d3466520a2b76a4e977d3f8601cec7b1b68f47baffffcac2072"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5NetworkManagerQt, -S${libdir}/glib-2.0/include, -S${STAGING_LIBDIR}/glib-2.0/include"
