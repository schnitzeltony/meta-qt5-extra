SUMMARY = "A color matching game"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "054bc8b14334477e8465a0d5a1a0de76"
SRC_URI[sha256sum] = "2f480bc45eea4bd3a3c96bc6e0a59722ae8a2997bfe67c66510203a19b354085"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
