SUMMARY = "C++ wrapper library around the POSIX threads API"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

DEPENDS = "ldconfig-native"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefile.patch \
"
SRC_URI[md5sum] = "6c82e4edece2db2de9451b6afe702a86"
SRC_URI[sha256sum] = "c659b14c0c4055c44432cb83060b95d30ae0c1ecc6f50d73968e239c100f7a31"

do_compile() {
    cd ${S}/source
    base_do_compile
}

do_install() {
    cd ${S}/source
	oe_runmake 'DESTDIR=${D}' 'LIBDIR=${libdir}' 'INCDIR=${includedir}' install
}
