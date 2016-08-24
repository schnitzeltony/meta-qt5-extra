SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake-lib cmake-auto-align-paths

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "45b8586afc97200ea687996fc5ce2327"
SRC_URI[sha256sum] = "3c5473e9fda6d2978deb602c42a4af84529578d2971a7c54d224e17867e95a54"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5NetworkManagerQt, -S${libdir}/glib-2.0/include, -S${STAGING_LIBDIR}/glib-2.0/include"
