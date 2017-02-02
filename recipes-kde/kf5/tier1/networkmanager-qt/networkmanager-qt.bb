SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1847ff297b1d103f45df11c49a8c07f9"
SRC_URI[sha256sum] = "f1bf161951fd6637bd48c8221a5bda070e31d7f8dce421c5fb8dcbce33669de9"

CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S;${libdir}, -s;${_IMPORT_PREFIX}/lib"
