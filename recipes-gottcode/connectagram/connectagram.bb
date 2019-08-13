SUMMARY = "Connectagram is a word unscrambling game"
HOMEPAGE = "https://gottcode.org/connectagram/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "db3ad80358b31df292d69b067c5657c6"
SRC_URI[sha256sum] = "04dbe12f52e68a0fececad1bbab08e279d7fd2f438e126bfc6d047daf1a55b75"
PV = "1.2.10"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
"

# WIP: qt5-translation expects *.qm to work properly so pack word data in PN for now
FILES_${PN} += " \
    ${datadir}/connectagram/data \
"
