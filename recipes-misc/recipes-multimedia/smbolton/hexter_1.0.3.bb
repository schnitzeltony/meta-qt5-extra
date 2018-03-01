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
    ${SOURCEFORGE_MIRROR}/project/dssi/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-gui_widgy_editor-fix-sefaulf-on-ARM.patch \
    file://hexter.desktop \
    file://hexter.png \
"
SRC_URI[md5sum] = "4c3ffd27eecb7eabf1ffc3fe334937bb"
SRC_URI[sha256sum] = "4d4091a73e04cdc9b39a6ad8aecaa9f122686a400b9e25f2617b6c0174547b3d"

do_compile_append() {
    cd ${S}/extra
    $CC $CFLAGS -o tx_edit tx_edit.c -lcurses -lasound -lm ${LDFLAGS}
}

do_install_append() {
    install -d ${D}/${datadir}/applications
    install -m 755 ${WORKDIR}/hexter.desktop ${D}/${datadir}/applications/

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
