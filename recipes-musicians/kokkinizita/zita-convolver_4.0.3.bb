SUMMARY = "A fast, partitioned convolution engine library"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit manpages

DEPENDS = " \
    ldconfig-native \
    fftw \
"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefile.patch \
"
SRC_URI[md5sum] = "a357f6ff8588eb53af5335968cfacf3a"
SRC_URI[sha256sum] = "9aa11484fb30b4e6ef00c8a3281eebcfad9221e3937b1beb5fe21b748d89325f"

do_compile() {
    cd ${S}/source
    base_do_compile
}

do_install() {
    cd ${S}/source
	oe_runmake 'DESTDIR=${D}' 'LIBDIR=${libdir}' 'INCDIR=${includedir}' install
}
