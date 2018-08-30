SUMMARY = "Program that automatically solves layouts of Freecell and similar variants"
HOMEPAGE = "hhttp://fc-solve.shlomifish.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=767c2b76f9e7b88434106e0b8823a577"

SRC_URI = "http://fc-solve.shlomifish.org/downloads/fc-solve/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "e01a1b6160f104b9402a9196aec35a68"
SRC_URI[sha256sum] = "869c210e7b63b0e0dcfb1c4a2322c41cfa8fbf8db01e7722254a7425a1ab7f81"

inherit cmake perlnative

DEPENDS += " \
    gperf-native \
    perl-path-tiny-native \
    perl-template-toolkit-native \
"

EXTRA_OECMAKE = " \
    -DFCS_WITH_TEST_SUITE=OFF \
    -DBUILD_STATIC_LIBRARY=OFF \
"
