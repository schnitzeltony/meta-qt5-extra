SUMMARY = "WhySynth — A DSSI Softsynth Plugin"
HOMEPAGE = "http://smbolton.com/whysynth.html"
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
    http://smbolton.com/${BPN}/${BPN}-${PV}.tar.bz2 \
    file://whysynth.desktop \
"
SRC_URI[md5sum] = "217bfeea23545c12cd0a1bc93de6ed0f"
SRC_URI[sha256sum] = "a602d685a6bf48b01a82e1c077a50fe3d115805865ecfe49f531d8bd20b00b0b"

CFLAGS += "-ftree-vectorize"

do_install_append() {
    install -d ${D}/${datadir}/applications
    install -m 644 ${WORKDIR}/whysynth.desktop ${D}/${datadir}/applications/

    install -d ${D}/${datadir}//icons/hicolor/36x36/apps
    install -m 644 ${S}/extra/whysynth-icon-32x32.png ${D}/${datadir}/icons/hicolor/36x36/apps/whysynth.png

    install -d ${D}/${bindir}
    ln -s jack-dssi-host ${D}/${bindir}/whysynth
}

FILES_${PN} += " \
    ${libdir}/dssi \
"

# standalone needs jack-dssi-host
RDEPENDS_${PN} += "dssi"
