SUMMARY = "C library for finding and handling crystal symmetries"
HOMEPAGE = "https://atztogo.github.io/spglib/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit cmake

SRC_URI = "git://github.com/spglib/spglib.git;branch=master;protocol=https"
SRCREV = "cc6e08b19b1548faae84c3aecf89beab4853b6d9"
S = "${WORKDIR}/git"
PV = "1.16.2"

