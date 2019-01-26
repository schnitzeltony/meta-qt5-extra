SUMMARY = "Yamaha DX7 modeling DSSI plugin"
HOMEPAGE = "http://dssi.sourceforge.net/hexter.html"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig gtk-icon-cache

DEPENDS += " \
    gtk+ \
    dssi \
    liblo \
    ladspa-sdk \
"

SRC_URI = " \
    git://github.com/smbolton/hexter.git \
    file://hexter.desktop \
    file://hexter.png \
"
SRCREV = "737dbb04c407184fae0e203c1d73be8ad3fd55ba"
S = "${WORKDIR}/git"

do_compile_append() {
    cd ${S}/extra
    $CC $CFLAGS -o tx_edit tx_edit.c -lcurses -lasound -lm ${LDFLAGS}
}

do_install_append() {
    install -d ${D}/${datadir}/applications
    install -m 644 ${WORKDIR}/hexter.desktop ${D}/${datadir}/applications/

    install -d ${D}/${datadir}//icons/hicolor/36x36/apps
    install -m 644 ${WORKDIR}/hexter.png ${D}/${datadir}/icons/hicolor/36x36/apps/

    install -d ${D}/${bindir}
    ln -s jack-dssi-host ${D}/${bindir}/hexter

    install -m 755 ${S}/extra/tx_edit ${D}/${bindir}
}

FILES_${PN} += " \
    ${libdir}/dssi \
"

# standalone needs jack-dssi-host
RDEPENDS_${PN} += "dssi"
