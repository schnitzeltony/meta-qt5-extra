SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "ca6c2d62374549c5528123e6a683b9e7"
SRC_URI[sha256sum] = "f9ab7697845c872d25e998f2b213d4c32c0b2ccdef99de018dc486d1c4a98388"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
