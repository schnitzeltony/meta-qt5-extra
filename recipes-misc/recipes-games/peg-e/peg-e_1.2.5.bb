SUMMARY = "Peg-E is a peg solitaire game"
HOMEPAGE = "http://gottcode.org/peg-e/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "62070311e753b197f2192543cc39a6c3"
SRC_URI[sha256sum] = "6ee95cce87c633333f2a30ad87ab0da882b0a90e0395242922da16f7e40cf6a1"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/peg-e/icons \
"
