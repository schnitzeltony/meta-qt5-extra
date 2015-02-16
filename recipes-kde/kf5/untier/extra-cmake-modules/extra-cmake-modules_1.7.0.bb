SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "45fd1e6f38b23b00983e5eab9ba61d15"
SRC_URI[sha256sum] = "c88de18f41fb9e5bb1f296bd4762315b2911fa5feb5c10aed8352d00fc08fdd1"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
