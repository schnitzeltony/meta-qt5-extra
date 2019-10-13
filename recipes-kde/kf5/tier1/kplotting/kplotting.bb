SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bbb2c78302af2205ae17e7bdd7e45da9"
SRC_URI[sha256sum] = "2957b8c5262e717950771a4f7bace00ff115069bb0db22b77e819d21c9c07786"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
