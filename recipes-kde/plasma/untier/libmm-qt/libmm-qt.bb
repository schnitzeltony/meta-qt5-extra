SUMMARY = "Qt wrapper for ModemManager DBus AP"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "927b12212376731c8d84f33e488ac8be"
SRC_URI[sha256sum] = "cd1532928f1b7362bf59b9abe13a2d7c0d2329ea785bc1167904b2e28a75e17c"

DEPENDS += " \
    modemmanager \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

