SUMMARY = "C11 / gnu11 utilities C library by Shlomi Fish / Rindolf"
HOMEPAGE = "https://github.com/shlomif/rinutils"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93a02b264605b1fd19838fde65a7ed37"

SRC_URI = " \
    git://github.com/shlomif/rinutils.git;branch=master;protocol=https \
    https://raw.githubusercontent.com/shlomif/shlomif-cmake-modules/master/shlomif-cmake-modules/Shlomif_Common.cmake;name=cmake;subdir=git/cmake \
"
SRCREV = "8670873c13590a8ef2b7b34ffa8576c6099921a7"
SRC_URI[cmake.sha256sum] = "6c72ff31b361319971bb8eca5d5679bd366b316a5543562e821e585af88cad17"
PV = "0.10.0"
S = "${WORKDIR}/git"

inherit cmake
