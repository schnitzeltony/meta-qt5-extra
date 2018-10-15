SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e0a5b0362ad60db58169263e4846fecf"
SRC_URI[sha256sum] = "0a387bca93f32d5c227f7d3ef5ca3fdde465c067135654fab7252dbe64bc7e5f"

CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
