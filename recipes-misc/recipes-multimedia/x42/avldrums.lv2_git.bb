SUMMARY = "Dedicated AVLDrumkits LV2 Plugin"
HOMEPAGE = "http://x42-plugins.com/x42/x42-avldrums"
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
"

SRC_URI = "gitsm://github.com/x42/avldrums.lv2.git"
SRCREV = "43b28a761ea980d176b66347a6f8a44fb4e84611"
PV = "0.3.0"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
    OPTIMIZATIONS= \
"

FILES_${PN} += "${libdir}/lv2"
