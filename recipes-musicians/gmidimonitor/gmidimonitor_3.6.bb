SUMMARY = "GTK+ application that shows MIDI events"
HOMEPAGE = "http://home.gna.org/gmidimonitor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=f1e8b3e96c0abf4e3abb3b0f8e8eaf7f"

inherit waf gtk-icon-cache

DEPENDS += " \
    gtk+ \
    jack \
"

SRC_URI = " \
    git://repo.or.cz/gmidimonitor.git \
    http://upload.wikimedia.org/wikipedia/commons/d/d5/RB_keyboard_icon.svg;name=icon \
    file://gmidimonitor-alsa.desktop \
    file://gmidimonitor-jack.desktop \
"
SRCREV = "a50612655903f1a56748604a5d0d27a5044a78b3"
S = "${WORKDIR}/git"

SRC_URI[icon.md5sum] = "e6e764ea13f2b15a297d8cd62540edf2"
SRC_URI[icon.sha256sum] = "16d3e31b4e9ef6e9c7ba3ab79876726f52da21631870cea95076a98913a0bd2c"

do_install_append() {
    install -d "${D}/${datadir}/applications"
    install ${WORKDIR}/gmidimonitor-alsa.desktop ${D}/${datadir}/applications/
    install ${WORKDIR}/gmidimonitor-jack.desktop ${D}/${datadir}/applications/

    install -d "${D}/${datadir}/pixmaps"
    install ${WORKDIR}/RB_keyboard_icon.svg ${D}/${datadir}/pixmaps/${BPN}.svg
}
