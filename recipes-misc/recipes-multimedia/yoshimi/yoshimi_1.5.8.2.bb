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

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/1.5/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "e9a0b110a7833833556191cc883a544d"
SRC_URI[sha256sum] = "acdb8c431a3b7231be9a1d6d5aea5dd7bd0f83cbf51e9721d69fb76fab69e7cd"

OECMAKE_SOURCEPATH = "${S}/src"

LDFLAGS += "-lpng16 -ljpeg -lXrender -lXft"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
