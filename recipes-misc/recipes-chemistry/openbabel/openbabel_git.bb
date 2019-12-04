SUMMARY = "The Open Source Chemistry Toolbox"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a41ad1c85f8bc03e14593891be09cf09"

inherit cmake

DEPENDS = " \
    imagemagick-native \
    cairo \
    libxml2 \
    zlib \
    libtirpc \
"

SRC_URI = " \
    git://github.com/openbabel/openbabel.git \
    file://0001-Workaround-xdr-linker-error.patch \
    file://openbabel-gui.desktop \
"
SRCREV = "49f9cfb32bd0bc6ea440639d338123eb27accbe2"
S = "${WORKDIR}/git"
PV = "3.0.0"

do_install_append() {
    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/openbabel-gui.desktop ${D}${datadir}/applications

    install -d ${D}${datadir}/pixmaps
    convert.im7 ${S}/src/GUI/babel.xpm -transparent white ${D}${datadir}/pixmaps/babel.png
}

FILES_${PN}-dev += "${libdir}/cmake"
