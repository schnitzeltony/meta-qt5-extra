SUMMARY = "Xapian is an Open Source Search Engine Library"
HOMEPAGE = "http://xapian.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "http://oligarchy.co.uk/xapian/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "2ebf4b85896ecc7e1a9c4f91226d14b4"
SRC_URI[sha256sum] = "4937f2f49ff27e39a42150e928c8b45877b0bf456510f0785f50159a5cb6bf70"

inherit autotools cmake_lib

DEPENDS = "util-linux zlib"

FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "xapian, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
