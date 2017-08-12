SUMMARY = "Software synth with a classic subtractive synthesizer topology"
HOMEPAGE = "http://amsynth.github.io/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=67b604758dd265c185ce36fcf76a889d"

inherit autotools pkgconfig gtk-icon-cache gettext

DEPENDS += " \
    gtk+ \
    intltool-native \
"

SRC_URI = " \
    https://github.com/${BPN}/${BPN}/releases/download/release-${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-Fix-installing-of-appdata.patch \
"
SRC_URI[md5sum] = "54eaabc55d90ece5675b3cb3c2dc732d"
SRC_URI[sha256sum] = "d05363b654752494c4b6a404d80d70d27857db5ec9ca398eebcf6c5b466d6668"

PACKAGECONFIG ??= "alsa dssi jack sndfile lv2"

PACKAGECONFIG[oss] = "--with-oss,--without-oss"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[dssi] = "--with-dssi,--without-dssi,dssi liblo,dssi"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"
PACKAGECONFIG[sndfile] = "--with-sndfile,--without-sndfile,libsndfile1"
PACKAGECONFIG[lv2] = "--with-lv2,--without-lv2,lv2"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
