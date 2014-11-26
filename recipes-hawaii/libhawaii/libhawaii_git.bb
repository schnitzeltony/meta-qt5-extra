SUMMARY = "Library shared among Hawaii Shell and other applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4b54a1fd55a448865a0b32d41598759d"

inherit cmake_qt5 cmake-lib

DEPENDS = "qtbase qtdeclarative extra-cmake-modules-native"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "bfa0935cd39ea157b21fc42d9e8ad7df35ddc137"
PV = "0.2.90+git${SRCPV}"

S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "Hawaii/HawaiiTargets.cmake, -cccoutforoe filecheckloop, -cccoutforoe filecheckloop"

FILES_${PN} += "${libdir}/hawaii"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Hawaii/Shell/Applications/.debug ${libdir}/hawaii/qml/Hawaii/Shell/Core/.debug"
