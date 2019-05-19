SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "95bc9df762d4a99b6e71f3fae9ee2bad"
SRC_URI[sha256sum] = "113f48b1ed07b7541bc205220197e245f547e0a08382c3aeb29b0c02e6ec4abe"

CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S;${libdir}, -S;${_IMPORT_PREFIX}/${baselib}"
