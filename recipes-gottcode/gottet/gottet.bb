SUMMARY = "A tetris clone using the Qt GUI toolkit"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[sha256sum] = "26647b12258180e46e76413a25b43b2a1c2f9169f0ea039015359ba9fbe4f2f8"
PV = "1.2.0"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
