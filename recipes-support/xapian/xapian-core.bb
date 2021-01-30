SUMMARY = "Xapian is an Open Source Search Engine Library"
HOMEPAGE = "http://xapian.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

PV = "1.4.18"
SRC_URI = "http://oligarchy.co.uk/xapian/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "196ddbb4ad10450100f0991a599e4ed944cbad92e4a6fe813be6dce160244b77"

inherit autotools cmake_lib

DEPENDS = "util-linux zlib"

FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "xapian, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
