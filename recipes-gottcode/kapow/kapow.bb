SUMMARY = "Kapow is a punch clock program to easily keep track of your hours"
HOMEPAGE = "https://gottcode.org/kapow/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "4f0fee606eff49d5a5cf9cdc9baae622"
SRC_URI[sha256sum] = "f18ccc4e42d6ddb763983d0bfdc1da4ff91faa83289796e1b238f5fa5404e51e"
PV = "1.5.9"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
