SUMMARY = "A linux editor for the Akai LPD8"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=6dc9df5fa3108f437a4580b0aebca196"

inherit pkgconfig qmake5 gtk-icon-cache

DEPENDS += " \
    qtbase \
    qtsvg \
    alsa-lib \
"

SRC_URI = " \
    git://github.com/charlesfleche/lpd8editor.git \
    file://lpd8-editor.desktop \
"
SRCREV = "bd15bd689329194a3c5c3d727c2318629b027e3a"
PV = "0.0.10"
S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}/${datadir}/applications
    install -m 644 ${WORKDIR}/lpd8-editor.desktop ${D}/${datadir}/applications/

    install -d ${D}/${datadir}/icons/hicolor/scalable/apps
    install -m 644 ${S}/icon.svg ${D}/${datadir}/icons/hicolor/scalable/apps/lpd8-editor.svg
}
