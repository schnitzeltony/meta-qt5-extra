SUMMARY = "Peg-E is a peg solitaire game"
HOMEPAGE = "http://gottcode.org/peg-e/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "93ed6aedc7821150a03dda72137a1486"
SRC_URI[sha256sum] = "89c7c70660347f8bde69996f609cf598b295eadbbbc75221c0b59f10bdf7d73b"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/peg-e/icons \
"
