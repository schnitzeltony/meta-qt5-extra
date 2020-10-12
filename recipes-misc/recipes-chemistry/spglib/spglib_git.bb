SUMMARY = "C library for finding and handling crystal symmetries"
HOMEPAGE = "https://atztogo.github.io/spglib/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit autotools

SRC_URI = "git://github.com/atztogo/spglib.git"
SRCREV = "ee34712a9f7fe228e100b8ec1080d8f206309e2a"
S = "${WORKDIR}/git"
PV = "1.16.0"

do_configure_prepend() {
    touch ${S}/NEWS ${S}/README ${S}/AUTHORS
}

do_install_append() {
    ln -sf libsymspg.so ${D}${libdir}/libspglib.so
}
