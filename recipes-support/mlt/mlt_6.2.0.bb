SUMMARY = "MLT Multimedia Framework"
HOMEPAGE = "http://www.mltframework.org"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcf3c825659e82539645da41a7908589 \
    file://GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
    file://GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

DEPENDS = " \
    gtk+ \
    qtbase \
    qtsvg \
    virtual/libx11 \
    pango \
    sox \
    libav \
    libsdl libsdl-image \
    libexif \
    libsamplerate0 \
    fftw \
    jack \
    ladspa-sdk \
"

# TBD sox not found due to missing pkgconfig / others - see log.do_configure

SRC_URI = " \
    https://github.com/mltframework/${BPN}/archive/v${PV}.tar.gz \
    file://0001-configure-use-pkgconfig-to-find-sdl.patch \
"
SRC_URI[md5sum] = "a1c70e535c61dd9242ac9f6ae58899d0"
SRC_URI[sha256sum] = "dd2ee742e89620de78a259790f92a7cadad67f0e0a6c1ea7ed932f96fb739fff"

inherit autotools-brokensep pkgconfig

CLEANBROKEN = "1"

CXXFLAGS += "--std=c++11"

CONF_ACCEL = " \
    --disable-mmx \
    --disable-sse \
    --disable-sse2 \
"

EXTRA_OECONF = " \
    ${CONF_ACCEL} \
    --enable-gpl \
"
