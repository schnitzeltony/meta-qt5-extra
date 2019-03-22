SUMMARY = "The MP4v2 library provides an API to create and modify mp4 files"
HOMEPAGE = "https://github.com/sergiomb2/libmp4v2/wiki"
LICENSE = "MPLv1.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb3014b036b6d2151d944aef6a84c36f"

inherit autotools pkgconfig

SRC_URI = "git://github.com/sergiomb2/${BPN}.git"
SRCREV = "855e9674232808ff3be7191b697dfb56917db21f"
S = "${WORKDIR}/git"
PV = "2.1.0+git${SRCPV}"
