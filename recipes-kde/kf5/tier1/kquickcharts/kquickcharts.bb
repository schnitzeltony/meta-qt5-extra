SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "e0cf77affa32c3301efc93c84ffa5d28"
SRC_URI[sha256sum] = "544a0769a751fc78847e4aab1332ab624526d795a59a1b07852a596845804403"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
