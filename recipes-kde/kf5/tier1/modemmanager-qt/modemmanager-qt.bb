SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib pkgconfig

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b83e0f1e3d36d9afaaaf7e45a03aa28"
SRC_URI[sha256sum] = "b096bd71999a533c5d414577d48cb4455831866411a3e6fafe476271ef69449d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
