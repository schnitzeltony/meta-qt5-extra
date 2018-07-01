SUMMARY = "Musical Instrument Tuner"
HOMEPAGE = "http://x42-plugins.com/x42/x42-tuner"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    virtual/libgl \
    libglu \
    glib-2.0 \
    pango \
    cairo \
    lv2 \
    jack \
    fftw \
"

SRC_URI = "gitsm://github.com/x42/tuna.lv2.git"
SRCREV = "d0c5044df527042d4d2b5365b5706ad151ca033d"
PV = "0.4.4+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
    OPTIMIZATIONS= \
"

FILES_${PN} += "${libdir}/lv2"
