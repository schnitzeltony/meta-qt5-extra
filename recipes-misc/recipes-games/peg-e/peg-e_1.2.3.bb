SUMMARY = "Peg-E is a peg solitaire game"
HOMEPAGE = "http://gottcode.org/peg-e/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "c035bf7eec14073d57840794c959d4ce"
SRC_URI[sha256sum] = "06fb50920453ae218dc4514e6f2850a3adb4aecb858caab7a7efb9cb78be5ee5"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/peg-e/icons \
"
