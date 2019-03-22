SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "f7567be498c365b6a2e301346d08659a"
SRC_URI[sha256sum] = "a3c56b6339fd314b198b7ec89d27f1919d4b480e7e0eae03980dda5fec31cd6a"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
