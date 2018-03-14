SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[md5sum] = "6c2d2d3cbd81606b86c4b88e592fa98a"
SRC_URI[sha256sum] = "3a72c3aba988c5e17eef1a805547f2567f5e31cf86676ed0d0761d478ae42f88"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
