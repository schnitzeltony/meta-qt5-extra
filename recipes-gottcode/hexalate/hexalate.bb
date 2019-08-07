SUMMARY = "A color matching game"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "465bdcaa8793dd74e1f1a13dddb78631"
SRC_URI[sha256sum] = "422f5fed8adc7e2bc43e22a5c0573385143f8b15e8b3495b7b766e0409fa9782"
PV = "1.1.5"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
