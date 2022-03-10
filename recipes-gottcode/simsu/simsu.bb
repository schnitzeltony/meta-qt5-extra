SUMMARY = "Simsu is a basic Sudoku game"
HOMEPAGE = "http://gottcode.org/simsu/"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 pkgconfig qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[sha256sum] = "6db0c004de67c122ac67f34cc6c1a68cd78be02034eceeab922848f87cb85e87"
PV = "1.4.0"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
"
