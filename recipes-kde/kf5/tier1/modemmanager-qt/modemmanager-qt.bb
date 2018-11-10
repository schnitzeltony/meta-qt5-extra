SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0121cc6445a988c3c9525657eaf730cf"
SRC_URI[sha256sum] = "08c9cbabdde683dbee953ca40ee41b5cb99b062c102feb8bb763d5e85974c693"

CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
