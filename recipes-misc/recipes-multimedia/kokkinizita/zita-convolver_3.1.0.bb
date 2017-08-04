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
SRC_URI[md5sum] = "7e264d0fb0d8ea277cdb4e33d764c68a"
SRC_URI[sha256sum] = "bf7e93b582168b78d40666974460ad8142c2fa3c3412e327e4ab960b3fb31993"

do_compile() {
    cd ${S}/libs
    base_do_compile
}

do_install() {
    cd ${S}/libs
	oe_runmake 'DESTDIR=${D}' 'PREFIX=${prefix}' 'LIBDIR=${baselib}' install
}
