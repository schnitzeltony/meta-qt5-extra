SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c7a41b3eaabebcf33a0525b90daca561"
SRC_URI[sha256sum] = "90290e73977dee9f5dd400d926e82bd7b5d1f59d5d04007ca035fd8894b044f2"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
