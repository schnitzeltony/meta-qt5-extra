SUMMARY = "C++ wrapper library around the X Window System API"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = " \
    ldconfig-native \
    clthreads \
    freetype \
    libxft \
"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefile.patch \
"
SRC_URI[md5sum] = "39af7de7888fb4d37362edbc94566314"
SRC_URI[sha256sum] = "8501e964f0e0746abc5083a0b75fe3b937281cc4a9f7d1450ff98e86bc337881"

do_compile() {
    cd ${S}/source
    base_do_compile
}

do_install() {
    cd ${S}/source
	oe_runmake 'DESTDIR=${D}' 'LIBDIR=${libdir}' 'INCDIR=${includedir}' install
}
