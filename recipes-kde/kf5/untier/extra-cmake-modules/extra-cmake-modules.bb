SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[md5sum] = "c2a45ed0dc72324d183d068d68149513"
SRC_URI[sha256sum] = "2ff1a4ede28488ea787e742ab37edaacc5f59bf9188476e48f681ce23300b9c4"
SRC_URI += "file://0001-Temporary-workaround-gold-linker-errors.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
