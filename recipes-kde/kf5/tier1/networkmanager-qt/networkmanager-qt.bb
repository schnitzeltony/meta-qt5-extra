SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib pkgconfig

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c1f71c733c5b4e03ad0af4a558c6dc8f"
SRC_URI[sha256sum] = "29a821326733290efd7f28b763fed22a0a47376dcd400187d0363a2f52de629b"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
