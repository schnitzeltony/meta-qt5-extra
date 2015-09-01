SUMMARY = "MLT Multimedia Framework"
HOMEPAGE = "http://www.mltframework.org"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcf3c825659e82539645da41a7908589 \
    file://GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
    file://GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

DEPENDS = " \
    glib-2.0 \
    qtbase \
    qtsvg \
    virtual/libx11 \
    pango \
    sox \
    libav \
    libsdl libsdl-image \
    libexif \
    libsamplerate0 \
    virtual/fftw \
"

# TBD sox not found due to missing pkgconfig / others - see log.do_configure

SRC_URI = " \
    https://github.com/mltframework/${BPN}/archive/v${PV}.tar.gz \
    file://0001-configure-use-pkgconfig-to-find-sdl.patch \
"
SRC_URI[md5sum] = "57397f2f0fa0545c248c5e9b59c140d5"
SRC_URI[sha256sum] = "1214d6ad7fd1c3d36f0b1e64fd1c8d8a7ab6290e8452396003e79d58c0d21074"

inherit autotools-brokensep pkgconfig

CLEANBROKEN = "1"

CONF_ACCEL = " \
    --disable-mmx \
    --disable-sse \
    --disable-sse2 \
"

EXTRA_OECONF = " \
    ${CONF_ACCEL} \
    --enable-gpl \
"
