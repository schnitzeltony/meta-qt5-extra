SUMMARY = "Library for changing Tempo/ Pitch/ PlaybackRates of audio streams/ files"
HOMEPAGE = "http://www.surina.net/soundtouch/index.html"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.TXT;md5=6ba0bdf1d64a1db7eef645db592dc030"

inherit autotools pkgconfig

SRC_URI = "http://www.surina.net/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d1ab4abb54640e8e308e36e309c94a6"
SRC_URI[sha256sum] = "caeb86511e81420eeb454cb5db53f56d96b8451d37d89af6e55b12eb4da1c513"
S = "${WORKDIR}/${BPN}"
