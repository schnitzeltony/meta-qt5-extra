SUMMARY = "Software synth with a classic subtractive synthesizer topology"
HOMEPAGE = "http://amsynth.github.io/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=67b604758dd265c185ce36fcf76a889d"

inherit autotools pkgconfig gtk-icon-cache gettext

DEPENDS += " \
    gtk+ gtkmm \
    intltool-native \
"

SRC_URI = " \
    https://github.com/${BPN}/${BPN}/releases/download/release-${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-Preset-return-reference-to-mName.patch \
    file://0002-dssi-report-presets-correctly.patch \
    file://0003-dssi-fix-preset-selection.patch \
"
SRC_URI[md5sum] = "4856f582caed59fca79dfe3ca4597938"
SRC_URI[sha256sum] = "08ec3fdc56b5eec89abed67d356458652ac5ebac2971aff4a147b9f8bcaa6169"

PACKAGECONFIG ??= "alsa dssi jack sndfile lv2"

PACKAGECONFIG[oss] = "--with-oss,--without-oss"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[dssi] = "--with-dssi,--without-dssi,dssi liblo,dssi"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"
PACKAGECONFIG[sndfile] = "--with-sndfile,--without-sndfile,libsndfile1"
PACKAGECONFIG[lv2] = "--with-lv2,--without-lv2,lv2"

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
