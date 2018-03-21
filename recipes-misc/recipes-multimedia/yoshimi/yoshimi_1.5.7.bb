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
SRC_URI[md5sum] = "96716cd3fc2aa0c26a67e35f45c01b17"
SRC_URI[sha256sum] = "33989c3e833a1f4128be55994a79a79d4f91b1e92fb378d4210542136b3521f1"

OECMAKE_SOURCEPATH = "${S}/src"

LDFLAGS += "-lpng16 -ljpeg -lXrender -lXft"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
