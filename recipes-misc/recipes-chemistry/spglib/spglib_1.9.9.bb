SUMMARY = "C library for finding and handling crystal symmetries"
HOMEPAGE = "https://atztogo.github.io/spglib/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e13e4b13c9ea72dbc9fda34255d9371"

inherit autotools

do_configure_prepend() {
    touch ${S}/NEWS ${S}/README ${S}/AUTHORS
}

do_install_append() {
    ln -sf libsymspg.so ${D}${libdir}/libspglib.so
}

SRC_URI = " \
    https://github.com/atztogo/${BPN}/archive/v${PV}.tar.gz \
"
SRC_URI[md5sum] = "6bbf2cb37a2294f26f2324e1142ab7d8"
SRC_URI[sha256sum] = "315642d356c3e7b9cd0e3854f39e10cae89d5f757860db280f61eab3b70d17c2"
