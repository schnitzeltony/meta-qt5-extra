SUMMARY = "Xapian is an Open Source Search Engine Library"
HOMEPAGE = "http://xapian.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "http://oligarchy.co.uk/xapian/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "e0361d7994287edf1248d320758e9f84"
SRC_URI[sha256sum] = "cde9c39d014f04c09b59d9c21551db9794c10617dc69ab4c9826352a533df5cc"

inherit autotools cmake_lib

DEPENDS = "util-linux zlib"

FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "xapian, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
