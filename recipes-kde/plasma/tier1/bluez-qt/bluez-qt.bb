SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-plasma cmake-lib

DEPENDS += "qtdeclarative"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e5ece42a1c25b10e751e7334c8420de0"
SRC_URI[sha256sum] = "05db3e81f00b164aeec7183e6816b5e74ddbca41ced2f0b1a0f972151d5a987d"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
