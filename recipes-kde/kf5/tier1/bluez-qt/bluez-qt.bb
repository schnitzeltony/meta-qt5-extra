SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "58377c34045907d67140df9167417919"
SRC_URI[sha256sum] = "db5b1d29f507b1af8ed7854341278ad210e3cde54c738b1db9d65af8f3890918"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
