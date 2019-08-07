SUMMARY = "A tetris clone using the Qt GUI toolkit"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "85272ffa824695e76e726dcce798dbe3"
SRC_URI[sha256sum] = "440e9570e2909e3029cced304774a15d83b4019925ac9a4cfb44c1f8a77592d8"
PV = "1.1.8"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
