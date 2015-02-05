SUMMARY = "Qt wrapper for ModemManager DBus AP"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6f17d46bed6463c9217dad8e1fe49387"
SRC_URI[sha256sum] = "dab0e9a3a82d4abb4686a1a900cab826091e1fa2c373db25ac42e3e1afded41d"

DEPENDS += " \
    modemmanager \
"

CMAKE_HIDE_ERROR[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

