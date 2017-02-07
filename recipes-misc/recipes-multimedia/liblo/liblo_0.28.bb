SUMMARY = "liblo is an implementation of the Open Sound Control protocol"
HOMEPAGE = "http://liblo.sourceforge.net"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit autotools pkgconfig

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-message.c-ensure-variables-are-set-to-fix-build.patch \
"
SRC_URI[md5sum] = "e2a4391a08b49bb316c03e2034e06fa2"
SRC_URI[sha256sum] = "da94a9b67b93625354dd89ff7fe31e5297fc9400b6eaf7378c82ee1caf7db909"
