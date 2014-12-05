SUMMARY = "Library shared among Hawaii Shell and other applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4b54a1fd55a448865a0b32d41598759d"

inherit cmake_qt5 cmake-lib

DEPENDS = "qtbase qtdeclarative extra-cmake-modules-native"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "20f7fcf49c90108c42f3ce0b7357775a846dfc2d"

S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "Hawaii, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "Hawaii, -S${includedir}, -S${STAGING_INCDIR}"


FILES_${PN} += "${libdir}/hawaii"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Hawaii/Shell/Applications/.debug ${libdir}/hawaii/qml/Hawaii/Shell/Core/.debug"
