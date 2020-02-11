SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "b07cef12653a85091fadd25260942cf6"
SRC_URI[sha256sum] = "3a4102cc7430ac37f2cc6a31a6a6c360979f1a269dc48457e290d0bf1de6b729"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
