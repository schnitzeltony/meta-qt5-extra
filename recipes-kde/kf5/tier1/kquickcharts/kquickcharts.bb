SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "77e7d9000044d8f548e27533ea849ffe"
SRC_URI[sha256sum] = "a1befe13903676a9779030b02b91da9889540e689e1f6a0afd54ff484109642a"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
