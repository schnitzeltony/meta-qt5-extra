SUMMARY = "C library for finding and handling crystal symmetries"
HOMEPAGE = "https://atztogo.github.io/spglib/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit autotools

SRC_URI = "git://github.com/atztogo/spglib.git"
SRCREV = "e8118d854a4c11dbaa8d7b2c55d4a1e74ddcaaf7"
S = "${WORKDIR}/git"
PV = "1.16.1"

do_configure:prepend() {
    touch ${S}/NEWS ${S}/README ${S}/AUTHORS
}

do_install:append() {
    ln -sf libsymspg.so ${D}${libdir}/libspglib.so
}
