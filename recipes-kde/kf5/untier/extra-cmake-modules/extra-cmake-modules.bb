SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[sha256sum] = "33bd83908daa531654455b77fc121b598f757aadf8ba01dbacfda8b8fb050319"
SRC_URI += "file://0001-Temporary-workaround-gold-linker-errors.patch"

PV = "${KF5_VERSION}"

FILES:${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
