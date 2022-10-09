SUMMARY = "CHMLIB is a library for dealing with Microsoft ITSS/CHM format files"
HOMEPAGE = "http://www.jedrea.com/chmlib/"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbb461211a33b134d42ed5ee802b37ff"

SRC_URI = " \
    http://www.jedrea.com/${BPN}/${BPN}-${PV}.tar.bz2 \
    file://0001-Patch-to-fix-integer-types-problem-by-Goswin-von-Bre.patch \
"
PV = "0.40"
SRC_URI[sha256sum] = "3449d64b0cf71578b2c7e3ddc048d4af3661f44a83941ea074a7813f3a59ffa3"

inherit autotools pkgconfig

DEPENDS += " \
"
