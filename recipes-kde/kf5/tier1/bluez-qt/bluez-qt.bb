SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "909827fc26098c7b4ab48c7228801e16"
SRC_URI[sha256sum] = "e3bfe021f1cf7b822387c9f11a8d6a86dd1a9b4b301fb564a67e2964b8cb92c7"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
