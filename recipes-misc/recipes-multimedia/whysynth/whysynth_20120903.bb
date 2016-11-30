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
    http://smbolton.com/${PN}/${PN}-${PV}.tar.bz2 \
    file://whysynth.desktop \
"
SRC_URI[md5sum] = "b521b63ade13b09062a64c46d2eabee2"
SRC_URI[sha256sum] = "acc0a4c8df1c8f36619861dfa32e3d2850783d462e2afec50c2210b2e3dd8686"

do_install_append() {
    install -d ${D}/${datadir}/applications
    install -m 755 ${WORKDIR}/whysynth.desktop ${D}/${datadir}/applications/

    install -d ${D}/${datadir}//icons/hicolor/36x36/apps
    install -m 644 ${S}/extra/whysynth-icon-32x32.png ${D}/${datadir}/icons/hicolor/36x36/apps/whysynth.png

    install -d ${D}/${bindir}
    ln -s jack-dssi-host ${D}/${bindir}/whysynth
}

FILES_${PN} += " \
    ${libdir}/dssi \
"

# we are not linking against dssi - so
RDEPENDS_${PN} += "dssi"
