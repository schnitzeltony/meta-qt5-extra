SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "fe9ab82d6675d0a00b3bad1cdd8511d4"
SRC_URI[sha256sum] = "77a6ececec02787731f32ebdbc0a89fe5cecb4418519e86311c445814eb9ab1c"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
