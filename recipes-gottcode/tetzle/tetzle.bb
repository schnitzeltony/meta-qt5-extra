SUMMARY = "Tetzle is a jigsaw puzzle game that uses tetrominoes for the pieces"
HOMEPAGE = "https://gottcode.org/tetzle/"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache mime-xdg

DEPENDS += "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "dc3e1545aaba5d7571c84a1a30c04210"
SRC_URI[sha256sum] = "fbc3c86b5bf64187f89379176bd0085c636605d9594c7af8d0c056760d6cf80a"
PV = "2.1.6"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
"
