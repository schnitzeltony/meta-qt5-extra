SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[md5sum] = "39590c81474016b01ce1bc29fb808c3e"
SRC_URI[sha256sum] = "64f41c0b4b3164c7be8fcab5c0181253d97d1e9d62455fd540cb463afd051878"
SRC_URI += "file://0001-Temporary-workaround-gold-linker-errors.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
