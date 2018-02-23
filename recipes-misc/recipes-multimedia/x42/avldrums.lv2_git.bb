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
SRCREV = "856f794c38a1769d108235e4ffb734c1f025f150"
PV = "0.2.2+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
    OPTIMIZATIONS= \
"

FILES_${PN} += "${libdir}/lv2"

# TBD ? - https://github.com/x42/avldrums.lv2/issues/5
#RDEPENDS_${PN} += "soundfont-collection-avl-drumkits"
