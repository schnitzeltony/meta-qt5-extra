SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "52d39cef082a351d187d3755cd6755f0"
SRC_URI[sha256sum] = "a1a992a7d4cc1808f98157664c8e8cedf28bc2c691e1b9e46d30b10fb0380048"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"
