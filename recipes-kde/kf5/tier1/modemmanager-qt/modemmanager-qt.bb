SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib pkgconfig

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7527cfdc8aa93e1ada1ebb765d90ab22"
SRC_URI[sha256sum] = "4b9cdf8d8e911dc04688918985d3ee115a99e99f2456be61845e40343d63885e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
