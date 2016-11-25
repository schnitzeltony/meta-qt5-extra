SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit kde-kf5

DEPENDS = "qttools"

SRC_URI[md5sum] = "c8b07337cc3c72a55ec40267f1b3eec4"
SRC_URI[sha256sum] = "50b40f7e755aa727d2b38a7d48885d4a457046676937b4f848a074041a06267a"
SRC_URI += "file://0001-FindQtWaylandScanner.cmake-align-path-to-our-needs.patch"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
