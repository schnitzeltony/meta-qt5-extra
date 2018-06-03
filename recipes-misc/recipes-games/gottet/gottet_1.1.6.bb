SUMMARY = "A tetris clone using the Qt GUI toolkit"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "ef22e0df90b350476827f9a881d6fcf3"
SRC_URI[sha256sum] = "b7124832e4ffdb404e9fd6f6f35ec37eb86352f49dc315fa48aa06aecd3d6c5c"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
