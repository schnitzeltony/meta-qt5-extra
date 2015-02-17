SUMMARY = "libstatgrab provides access to statistics about the system"
HOMEPAGE = "http://www.i-scream.org/libstatgrab/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "ftp://ftp.i-scream.org/pub/i-scream/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b906d312076ca9be3d5188edfe07f496"
SRC_URI[sha256sum] = "03e9328e4857c2c9dcc1b0347724ae4cd741a72ee11acc991784e8ef45b7f1ab"

inherit autotools pkgconfig

DEPENDS += "ncurses"
RDEPENDS_${PN} += "perl"
