SUMMARY = "NTK is a fork of FLTK"
SECTION = "libs"
LICENSE = "LGPLv2 & FLTK"
LIC_FILES_CHKSUM = "file://COPYING;md5=f6b26344a24a941a01a5b0826e80b5ca"

SRC_URI = " \
    git://github.com/original-male/${BPN}.git \
    file://0001-wscript-check-compile-instead-of-tun-check-datatype-.patch \
"
SRCREV = "1e3f5106d404562902bed2983403301db24a3f78"
S = "${WORKDIR}/git"
PV_LAST_RELEASE = "1.3.1000"
PV = "${PV_LAST_RELEASE}"

inherit waf pkgconfig

DEPENDS = " \
    cairo \
    libpng \
    jpeg \
    zlib \
    libxft \
"

WAF_EXTRA_CONF = " \
    --libdir=${libdir} \
"

do_install_append() {
    rm ${D}${libdir}/libntk.a
    rm ${D}${libdir}/libntk.a.1
    mv ${D}${libdir}/libntk.a.${PV_LAST_RELEASE} ${D}${libdir}/libntk.a

    rm ${D}${libdir}/libntk_images.a
    rm ${D}${libdir}/libntk_images.a.1
    mv ${D}${libdir}/libntk_images.a.${PV_LAST_RELEASE} ${D}${libdir}/libntk_images.a
}

BBCLASSEXTEND = "native"
