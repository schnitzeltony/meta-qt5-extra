SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "ed9215d9dc1c9fe60b1b5ce2b8e70212"
SRC_URI[sha256sum] = "fc82529d859f18a9709ebcf66c0c404898c9b01ce062a65f65c1562b0eb9f549"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
