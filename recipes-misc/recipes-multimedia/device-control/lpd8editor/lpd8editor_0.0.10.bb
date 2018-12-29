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
SRCREV = "5ca6f2b90889893e0633b23ffe0e4a014096656a"
PV = "0.0.12"
S = "${WORKDIR}/git"

do_install_append() {
    install -Dm 644 ${WORKDIR}/lpd8-editor.desktop ${D}/${datadir}/applications/lpd8-editor.desktop
    install -Dm 644 ${S}/lpd8editor.svg ${D}/${datadir}/icons/hicolor/scalable/apps/lpd8-editor.svg
}
