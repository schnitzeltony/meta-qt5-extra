SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "e877d996f478419c3a749cfc425bd6c0"
SRC_URI[sha256sum] = "47bc234a9a1e3f041d0386a1971e34be3a1f024ba94c2d88e48475923473f56a"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
