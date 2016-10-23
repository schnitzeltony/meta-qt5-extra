SUMMARY = "Audio visualisation library"
HOMEPAGE = "https://sourceforge.net/projects/libvisual/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b83fd9e43985ce0c01e7b2a65d6432c"

# brokensep is mandatory: otherwise shipped lvconfig.h with x86 defaults is used
inherit autotools-brokensep pkgconfig gettext

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f4e78547c79ea8a8ad111cf8b85011bb"
SRC_URI[sha256sum] = "0b4dfdb87125e129567752089e3c8b54cefed601eef169d2533d8659da8dc1d7"
