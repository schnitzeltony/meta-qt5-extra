SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[md5sum] = "a88c5e7093b3bd7d6e6c47edc263918b"
SRC_URI[sha256sum] = "dacc8e0be8605b6c609ea35bda2d87bf06e1d228bcbf8957b0f0230c4a888359"
SRC_URI += "file://0001-Temporary-workaround-gold-linker-errors.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
