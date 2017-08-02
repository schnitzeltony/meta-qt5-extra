SUMMARY = "C++ wrapper library around the X Window System API"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = " \
    clthreads \
    freetype \
    libxft \
"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefile.patch \
"
SRC_URI[md5sum] = "bd6df73f688c9be1b3afef58283d7ef5"
SRC_URI[sha256sum] = "80da572961ff0c635889986ae9b42c97a4aede2d966095aba7f4119360ee8792"


do_install() {
    install -d "${D}${prefix}/include"
	oe_runmake 'PREFIX=${D}${prefix}' 'LIBDIR=${baselib}' install
}
