SUMMARY = "Molecular point group symmetry lib"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit cmake cmake_lib

SRC_URI = " \
    git://github.com/mcodev31/${BPN}.git \
"
SRCREV = "c99470376270db4ec4c925b952fa722e011377d6"
S = "${WORKDIR}/git"
PV = "0.2.3"

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"

CMAKE_ALIGN_SYSROOT[1] = "libmsym, -S${libdir}/libmsym.so, -s${OE_QMAKE_PATH_HOST_LIBS}/libmsym.so"
