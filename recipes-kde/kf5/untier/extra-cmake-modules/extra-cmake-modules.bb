SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[md5sum] = "c5f37f3f426f319a700e610f8a3c6866"
SRC_URI[sha256sum] = "1a630b242242ac32d20d14e7ae5645aa28a47676eae0e62ed76af8bc1f56c438"
SRC_URI += "file://0001-Temporary-workaround-gold-linker-errors.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
