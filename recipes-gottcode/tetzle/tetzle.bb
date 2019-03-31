SUMMARY = "Tetzle is a jigsaw puzzle game that uses tetrominoes for the pieces"
HOMEPAGE = "https://gottcode.org/tetzle/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "df7a1a9174a3802b8738ddb3f423d0da"
SRC_URI[sha256sum] = "ef67083018dc5e22a61d52e3041d6d725753e6ed5bc70b770159d867451c8cb1"
PV = "2.1.3"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"
