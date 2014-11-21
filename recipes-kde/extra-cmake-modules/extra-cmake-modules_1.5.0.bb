DESCRIPTION = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit cmake_qt5

SRC_URI = "git://anongit.kde.org/extra-cmake-modules;protocol=git"

SRCREV = "7e535b93cdbb7420d241c00cb9c0abf462ff59d8"
S = "${WORKDIR}/git"

DEPENDS = "qttools-native"

FILES_${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
