SUMMARY = "A set of extra lv2 plugins from the guitarix project"
HOMEPAGE = "https://github.com/brummer10/GxPlugins.lv2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = " \
    gitsm://github.com/brummer10/GxPlugins.lv2.git \
    file://0001-Adjust-Makefiles-for-cross-compiling.patch \
"
SRCREV = "63f19485984c002caddec734a9ee94faad2acb55"
S = "${WORKDIR}/git"
PV = "0.6"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    cairo \
    virtual/libx11 \
    lv2 \
"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
"

FILES_${PN} += "${libdir}/lv2"
