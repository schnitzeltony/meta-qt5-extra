SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5f2a80ba6d97425295bec254e8bd0700"
SRC_URI[sha256sum] = "7472943518a4b0e2fe1877ce47b9f667e178822926985a0efc9c20361097b94e"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
