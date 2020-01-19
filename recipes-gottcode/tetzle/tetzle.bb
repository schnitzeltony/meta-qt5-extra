SUMMARY = "Tetzle is a jigsaw puzzle game that uses tetrominoes for the pieces"
HOMEPAGE = "https://gottcode.org/tetzle/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache mime-xdg

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "85685c336812e6e46133ab5e82be4a4d"
SRC_URI[sha256sum] = "982bac58aa37be4ac27a723b84d122af62b8cdce63d9aad180efa48427ce10b0"
PV = "2.1.5"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
