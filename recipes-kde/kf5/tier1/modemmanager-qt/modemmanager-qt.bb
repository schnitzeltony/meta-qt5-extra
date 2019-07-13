SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "43693095957a309dfb210dfb81cfacf1"
SRC_URI[sha256sum] = "461b99099376d1210dad7867627c67b2a64af908a4fca0aeed75fc36059cad4e"

CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
