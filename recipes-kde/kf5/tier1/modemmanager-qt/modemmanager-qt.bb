SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib pkgconfig cmake-auto-align-paths

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b3c61320b50e06b9e3919d10d45229f7"
SRC_URI[sha256sum] = "e99c36a09abe78289932ca24e689b0de21e32fd15280bffc0df4f3684ac75662"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
