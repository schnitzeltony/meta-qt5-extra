SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-plasma cmake-lib

DEPENDS += "qtdeclarative"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "2faf9cc5fe74bf1d468ef63a03286d18"
SRC_URI[sha256sum] = "90e625d20c2e19419fe782ffd1d556cf1f280386e6c474073406baf551bc892d"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
