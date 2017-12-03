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
    mxml \
    libpng jpeg \
    libxrender \
    libxft \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/1.5/${BPN}-${PV}.tar.bz2 \
    file://0001-No-sse-by-default.patch \
"
SRC_URI[md5sum] = "e8f580a2d3628a8cf0831dd2d5ec7e1f"
SRC_URI[sha256sum] = "466e51ee9eb229ee96bc680e29fc0ea31832b9e7ceb23d9a1d7529dfa97cb5e4"

OECMAKE_SOURCEPATH = "${S}/src"

LDFLAGS += "-lpng16 -ljpeg -lXrender -lXft"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
