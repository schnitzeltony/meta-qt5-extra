SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "128bc6a24f866e9a60bede867fa733f5"
SRC_URI[sha256sum] = "668e5a728cb541986dfcdf2e9cb40fff372bbfbfd7e49de0ad38463cc9e2b477"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BluezQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BluezQt, -S${includedir}, -S${STAGING_INCDIR}"
