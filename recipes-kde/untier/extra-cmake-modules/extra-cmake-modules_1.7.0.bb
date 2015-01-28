SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit cmake_qt5

SRC_URI = "git://anongit.kde.org/extra-cmake-modules;protocol=git"

SRCREV = "ca6d601ac04f8ef5813f6b02015a37622d68ef6c"
S = "${WORKDIR}/git"

DEPENDS = "qttools"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
