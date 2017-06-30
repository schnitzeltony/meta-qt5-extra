SUMMARY = "NTK is a fork of FLTK"
SECTION = "libs"
LICENSE = "LGPLv2 & FLTK"
LIC_FILES_CHKSUM = "file://COPYING;md5=f6b26344a24a941a01a5b0826e80b5ca"

SRC_URI = " \
    git://github.com/original-male/${BPN}.git \
    file://0001-wscript-check-compile-instead-of-tun-check-datatype-.patch \
"
SRCREV = "92365eca0f9a6f054abc70489c009aba0fcde0ff"
S = "${WORKDIR}/git"
PV_LAST_RELEASE = "1.3.0"
PV = "${PV_LAST_RELEASE}+git${SRCPV}"

inherit waf pkgconfig

DEPENDS = " \
    cairo \
    libpng \
    jpeg \
    zlib \
    libxft \
"

do_install_append() {
    rm ${D}${libdir}/libntk.a
    rm ${D}${libdir}/libntk.a.1
    mv ${D}${libdir}/libntk.a.${PV_LAST_RELEASE} ${D}${libdir}/libntk.a

    rm ${D}${libdir}/libntk_images.a
    rm ${D}${libdir}/libntk_images.a.1
    mv ${D}${libdir}/libntk_images.a.${PV_LAST_RELEASE} ${D}${libdir}/libntk_images.a
}
