SUMMARY = "C library for finding and handling crystal symmetries"
HOMEPAGE = "https://atztogo.github.io/spglib/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit autotools

SRC_URI = "git://github.com/atztogo/spglib.git"
SRCREV = "4c9ad83acfd29b34b929b8384d22e8bc85aac81c"
S = "${WORKDIR}/git"
PV = "1.11.2"

do_configure_prepend() {
    touch ${S}/NEWS ${S}/README ${S}/AUTHORS
}

do_install_append() {
    ln -sf libsymspg.so ${D}${libdir}/libspglib.so
}
