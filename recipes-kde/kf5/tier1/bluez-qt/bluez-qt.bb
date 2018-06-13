SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3315573c700e6203345d89d34ab02a8d"
SRC_URI[sha256sum] = "33acf34814ace5d412e3704e2de07ff52d6525021defd719daaff694dfdd0fdf"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/bluezqt/.debug"
