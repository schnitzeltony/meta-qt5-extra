SUMMARY = "GigaStudio/Gigasampler, DLS, AKAI, SoundFont, KORG file access library"
HOMEPAGE = "http://www.linuxsampler.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=526c29250ae72f6933cdc01414b9943b \
"

DEPENDS = " \
    util-linux \
    libsndfile1 \
"

inherit autotools pkgconfig lib_package

SRC_URI = "http://download.linuxsampler.org/packages/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "a2ad3f933d13332b7a2ea68de20fa4b7"
SRC_URI[sha256sum] = "06a280278a323963042acdf13b092644cceb43ef367fcbb9ca7bbedff132bd0b"

FILES_SOLIBSDEV = "${libdir}/${BPN}/lib*${SOLIBSDEV}"
