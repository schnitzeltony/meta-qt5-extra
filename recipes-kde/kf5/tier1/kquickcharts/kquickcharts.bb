SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "9c94f758a7d8d9e9eb2caaa9a85fff5d"
SRC_URI[sha256sum] = "2cfb78bc2a7659a8c4ca6b072ff586c44e6da64e10b84a0fb0c5e3f03c944628"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
