SUMMARY = "A tetris clone using the Qt GUI toolkit"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "fa0133a63342954aa7136e24dcb48743"
SRC_URI[sha256sum] = "f5aeb5cd260b0798c6a3a7cf018c67977be7a475085aa9cf0ca51e0e61d8ddac"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
