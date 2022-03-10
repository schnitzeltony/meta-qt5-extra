SUMMARY = "Kapow is a punch clock program to easily keep track of your hours"
HOMEPAGE = "https://gottcode.org/kapow/"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 pkgconfig qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "51900b071ef71da4c86ee38bda161e72"
SRC_URI[sha256sum] = "6ba62239f5717422d899573ff50f8a967aea8fbbd79ac57406d6b86a333d027c"
PV = "1.5.10"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
"
