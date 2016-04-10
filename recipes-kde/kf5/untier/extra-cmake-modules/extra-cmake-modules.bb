SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "91473997dd136046e1917795711e4b9b"
SRC_URI[sha256sum] = "a3529edf7a2d6f5c345d7903baaace542afe9cde20fc2bc19b3bfdc5a62b6ccd"
SRC_URI += "file://0001-FindQtWaylandScanner.cmake-align-path-to-our-needs.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
