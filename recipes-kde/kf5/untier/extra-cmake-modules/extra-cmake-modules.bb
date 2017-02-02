SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "3678f6f17ff10ba5022fc1800028538f"
SRC_URI[sha256sum] = "7da9647514e134db5054ab4848d4bfa6054537593a95720a7a9361f8cc71a96c"
SRC_URI += "file://0001-FindQtWaylandScanner.cmake-align-path-to-our-needs.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
