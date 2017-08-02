SUMMARY = "A C++ library for resampling audio signals"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit manpages

DEPENDS = " \
    libsndfile1 \
"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefiles.patch \
"
SRC_URI[md5sum] = "7b5ddc42f210985b29c8769111217e4c"
SRC_URI[sha256sum] = "10888d76299d8072990939be45d6fc5865f5a45d766d7690819c5899d2a588f0"

# for builing apps
CXXFLAGS+=" -I../libs"
LDFLAGS+=" -L../libs"

do_compile() {
    cd ${S}/libs
    base_do_compile

    # create lib link for building apps
    ln -s lib${BPN}.so.${PV} lib${BPN}.so

    cd ${S}/apps
    base_do_compile
}

do_install() {
    cd ${S}/libs
	oe_runmake 'DESTDIR=${D}' 'PREFIX=${prefix}' 'LIBDIR=${baselib}' install

    cd ${S}/apps
	oe_runmake 'DESTDIR=${D}' 'PREFIX=${prefix}' 'LIBDIR=${baselib}' install
}
