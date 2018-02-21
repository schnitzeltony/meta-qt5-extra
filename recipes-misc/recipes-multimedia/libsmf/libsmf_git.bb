SUMMARY = "C library for handling Standard MIDI Files"
HOMEPAGE = "https://github.com/stump/libsmf"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=73755aa03cb15d62bbf780d2c17f31b7"

inherit autotools pkgconfig

SRC_URI = "git://github.com/stump/libsmf.git"
SRCREV = "692e728d2c13caa3896880216f19f5565ea03886"
S = "${WORKDIR}/git"

PV = "1.3+git${SRCPV}"

DEPENDS += "glib-2.0"
