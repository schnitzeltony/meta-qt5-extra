SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ef318c1b89d24c3e123a7bd99fb483a5"
SRC_URI[sha256sum] = "21cd64acbe50d402ea5c3636e628acbc8c73ee32021a6e184c449380216380c2"

CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
