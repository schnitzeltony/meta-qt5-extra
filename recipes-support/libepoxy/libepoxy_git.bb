SUMMARY = "Epoxy is a library for handling OpenGL function pointer management"
HOMEPAGE = "<http://github.com/anholt/libepoxy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=58ef4c80d401e07bd9ee8b6b58cf464b"

SRC_URI = " \
	git://github.com/anholt/libepoxy.git;protocol=git;branch=master \
	file://0001-configure.ac-don-t-rely-on-Xorg.macros.patch \
	file://0002-take-configuration-into-consideration-when-selecting.patch \
"
SRCREV = "20062c25e7612cab023cdef44d3277ba1bd0b2de"
PV = "1.2+git${SRCPV}"
S = "${WORKDIR}/git"

inherit autotools pkgconfig pythonnative

DEPENDS = "virtual/egl ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)}"
