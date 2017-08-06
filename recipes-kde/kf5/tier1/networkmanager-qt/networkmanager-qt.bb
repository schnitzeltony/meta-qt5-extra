SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "18b476e6a7ea204b3e614e77756e1286"
SRC_URI[sha256sum] = "5d2845ea6b25e1c73f6ce2b9236a3ceccf3271c4d18f67fa917cee13154e31d6"

CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S;${libdir}, -s;${_IMPORT_PREFIX}/lib"
