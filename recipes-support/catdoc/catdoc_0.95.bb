SUMMARY = "Read MS-Word files and outputs text"
HOMEPAGE = "https://www.wagner.pp.ru/~vitus/software/catdoc/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "http://ftp.wagner.pp.ru/pub/catdoc/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4ece2f43b140fab6a2c3a9d6436d7779"
SRC_URI[sha256sum] = "514a84180352b6bf367c1d2499819dfa82b60d8c45777432fa643a5ed7d80796"

inherit autotools-brokensep pkgconfig

EXTRA_OECONF = "--with-install-root=${D}"

do_install:prepend() {
    install -d ${D}/${datadir}/man/man1
    install -d ${D}/${datadir}/${BPN}
}
