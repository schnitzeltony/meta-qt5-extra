SUMMARY = "Yoshimi is a software synthesizer for Linux, a fork of ZynAddSubFX"
HOMEPAGE = "http://yoshimi.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c5f39c482ca5ca058c1ebd39612cf98"

inherit cmake qemu-ext pkgconfig gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    alsa-lib \
    fftw \
    jack \
    dssi \
    lv2 \
    cairo \
    fltk fltk-native \
    libmxml \
    libpng jpeg \
    libxrender \
    libxft \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/1.5/${BPN}-${PV}.tar.bz2 \
"
SRC_URI[md5sum] = "953662f7552f4f55851554ee76215bfd"
SRC_URI[sha256sum] = "0128bff8926e19344058499756772ba11e6055678cf4b1a3a0480384274e29e7"

OECMAKE_SOURCEPATH = "${S}/src"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
