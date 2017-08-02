SUMMARY = "C++ wrapper library around the POSIX threads API"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefile.patch \
"
SRC_URI[md5sum] = "90b650f1f5c9f39f4d77f73aca3c53be"
SRC_URI[sha256sum] = "a69fd566af24b85a10c5ecd957a85b7f5eb1c56995d2b999219b52f353ea1de9"


do_install() {
    install -d "${D}${prefix}/include"
	oe_runmake 'PREFIX=${D}${prefix}' 'LIBDIR=${baselib}' install
}
