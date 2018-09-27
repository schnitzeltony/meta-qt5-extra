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

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/1.5/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "5368486f9b1525ac9026e0934bbcb9ac"
SRC_URI[sha256sum] = "20f3b36caf8d3d3ba038a33cb9e75b22fab60bca63c0fc814195046430ef1cdb"

OECMAKE_SOURCEPATH = "${S}/src"

LDFLAGS += "-lpng16 -ljpeg -lXrender -lXft"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${libdir}/lv2 \
"
