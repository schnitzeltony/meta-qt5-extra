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
    file://0001-Keep-build-system-CXXFLAGS-when-not-selecting-a-spec.patch \
"
SRC_URI[md5sum] = "1c3b2eb1e85c9ecd07729b43746da288"
SRC_URI[sha256sum] = "5445edf05157960303564cd7f9719faf009aba763e783f2293b613768bfd5f55"

OECMAKE_SOURCEPATH = "${S}/src"

LDFLAGS += "-lpng16 -ljpeg -lXrender -lXft"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
