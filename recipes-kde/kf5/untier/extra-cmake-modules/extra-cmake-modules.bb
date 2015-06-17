SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "0e1298c6fce735f06c789a173c0093ff"
SRC_URI[sha256sum] = "9ee39c08ca4a6066e9c7061b740ed8b1d5f289e6b19a568d1704585d883cb718"
SRC_URI += "file://0001-FindQtWaylandScanner.cmake-align-path-to-our-needs.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
