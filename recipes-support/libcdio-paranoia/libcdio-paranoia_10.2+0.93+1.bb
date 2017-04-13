SUMMARY = "CD paranoia libraries from libcdio"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "libcdio"

SRC_URI = "http://ftp.gnu.org/gnu/libcdio/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "0255aa50e660db7f2c39658b9c565814"
SRC_URI[sha256sum] = "ec1d9b1d5a28cc042f2cb33a7cc0a2b5ce5525f102bc4c15db1fac322559a493"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-cpp-progs --disable-static --disable-example-progs"
