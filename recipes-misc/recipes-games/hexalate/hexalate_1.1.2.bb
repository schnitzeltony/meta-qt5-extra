SUMMARY = "A color matching game"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "6f5af7a2dad15671cfa940fd25d5522c"
SRC_URI[sha256sum] = "3a261e6b07f69b24332a13857b41684969a94be3aaee7a4a6f9d2115ef76dd4f"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
