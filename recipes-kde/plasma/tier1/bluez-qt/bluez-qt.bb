SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-plasma cmake-lib

DEPENDS += "qtdeclarative"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8af6a399bbecc58dd726daea9aa9c6b7"
SRC_URI[sha256sum] = "149c6776e89f33c25a05ccab171e82e5bef1ba576bb9026522af1b37ebf2258e"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
