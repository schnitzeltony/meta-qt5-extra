SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "d3e8887703dddc59999021bb364da860"
SRC_URI[sha256sum] = "79b35bef30b6629574cb563d60291b4dc2cd41f52dc48acde53dcb874656b6a6"
PV = "1.3.8"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
