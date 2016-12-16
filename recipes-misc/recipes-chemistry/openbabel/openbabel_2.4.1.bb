SUMMARY = "The Open Source Chemistry Toolbox"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a41ad1c85f8bc03e14593891be09cf09"

inherit cmake

DEPENDS = " \
    imagemagick-native \
    cairo \
    libxml2 \
    zlib \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://openbabel-gui.desktop \
    file://0001-take-care-for-ARM-s-unsigned-char.patch \
"
SRC_URI[md5sum] = "d9defcd7830b0592fece4fe54a137b99"
SRC_URI[sha256sum] = "204136582cdfe51d792000b20202de8950218d617fd9c6e18cee36706a376dfc"

do_install_append() {
    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/openbabel-gui.desktop ${D}${datadir}/applications

    install -d ${D}${datadir}/pixmaps
    convert.im7 ${S}/src/GUI/babel.xpm -transparent white ${D}${datadir}/pixmaps/babel.png
}

FILES_${PN} += "${libdir}/cmake"
