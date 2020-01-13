SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=12547d25b034355eba3018eb0d9be513"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[md5sum] = "d0b60c318cfaca243e97b098aab89a16"
SRC_URI[sha256sum] = "70fae10b2af1c504e3b166beb0a342cdef0e0f8eb42e53ba88f0e3b174331624"

PV = "${KF5_VERSION}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
