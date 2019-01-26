SUMMARY = "liblo is an implementation of the Open Sound Control protocol"
HOMEPAGE = "http://liblo.sourceforge.net"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit autotools pkgconfig

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-Fix-build-with-GCC-8.patch \
"
SRC_URI[md5sum] = "b0e70bc0fb2254addf94adddf85cffd3"
SRC_URI[sha256sum] = "ace1b4e234091425c150261d1ca7070cece48ee3c228a5612d048116d864c06a"
