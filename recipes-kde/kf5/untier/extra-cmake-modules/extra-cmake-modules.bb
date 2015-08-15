SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "26b970f7e02fd8d4b1828784f7359d18"
SRC_URI[sha256sum] = "ba52848a75347fb70c55f1bcd28c3594c067075c17a46b1f8c2951ebe0d3d5c2"
SRC_URI += "file://0001-FindQtWaylandScanner.cmake-align-path-to-our-needs.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
