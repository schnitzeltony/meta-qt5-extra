SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib pkgconfig cmake-auto-align-paths

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb052a66a7e7083d6d222720e2de8076"
SRC_URI[sha256sum] = "f694cd90352776a50181e659ab45a3280016eca260a4615e215abf7ac59513f0"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
