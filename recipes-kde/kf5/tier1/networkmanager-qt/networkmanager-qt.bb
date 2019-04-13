SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fb8de2bb00232ac30d522a0d9c1c5771"
SRC_URI[sha256sum] = "4d2da2556bfeef4be03833d707284573b469a1f6ad66ba73eae80835bd2e1982"

CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S;${libdir}, -S;${_IMPORT_PREFIX}/${baselib}"
