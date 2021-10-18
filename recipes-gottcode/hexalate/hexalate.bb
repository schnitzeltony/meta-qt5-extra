SUMMARY = "A color matching game"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 pkgconfig qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[sha256sum] = "a54aa31c6243ba091f46a6ced17be70e7481cc2af7de94f7e0288864355133bd"
PV = "1.2.0"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
