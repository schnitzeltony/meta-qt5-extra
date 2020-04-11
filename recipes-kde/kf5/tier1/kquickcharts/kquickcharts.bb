SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "a19bc5a3df2c1090491a42e3d5e29f8b"
SRC_URI[sha256sum] = "a532ef82542a58d61dc5934835393e8de0f2ec8a3058096f46c2b7ba0ae92b16"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
