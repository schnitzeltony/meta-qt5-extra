SUMMARY = "Qt wrapper for ModemManager DBus AP"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma cmake-lib

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9b71038c7a9bfb7c89a92176dc28fbf3"
SRC_URI[sha256sum] = "96c346189c3021c7712043ad22df3e89136e5d876bd9dce0e9594622df227858"

DEPENDS += " \
    modemmanager \
"

CMAKE_HIDE_ERROR[1] = "KF5ModemManagerQt, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KF5ModemManagerQt, -S${libdir}, -S${STAGING_LIBDIR}"

