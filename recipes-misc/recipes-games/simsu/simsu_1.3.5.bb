SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "289321393c7881ab5f96a025633b5a95"
SRC_URI[sha256sum] = "00c6afc5d5909fabbffc6f37f78834e2e7f54e5d26a9994414940d8917941a2b"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
