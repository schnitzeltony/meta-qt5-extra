SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib pkgconfig cmake-auto-align-paths

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6b14c285d47ffc1e1bab756cf659ab7a"
SRC_URI[sha256sum] = "29e7968ebaa0fe76f3b7430faff0784ee42dbdecfc74366d286d7cdda518b1eb"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
