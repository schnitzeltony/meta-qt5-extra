SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "cdfe8a57e3065e008d6707763c127555"
SRC_URI[sha256sum] = "bf147e675ae01e7bccf092cd9b9e5ae89b7f0893e28f7e65239b8b0371f6562a"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/appdata \
"
