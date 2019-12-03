SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3f405d8c3511d4049f5a93ea66dd0cc8"
SRC_URI[sha256sum] = "f38f65c97d199077c88213bce84c6162ba254c443f06ccfaf62088ff0e217f7b"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
