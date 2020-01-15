SUMMARY = "FocusWriter is a simple, distraction-free writing environment"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache mime-xdg

DEPENDS += " \
    qttools-native \
    qtbase \
    qtmultimedia \
    hicolor-icon-theme \
    hunspell \
"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "a9a33873fc7c0f919fe575b78278fdbf"
SRC_URI[sha256sum] = "5886054427da20ef0542dc97c8d2b4308b0a169b49f0409633dd8b17fe71bc94"
PV = "1.7.3"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/symbols1000.dat \
    ${datadir}/${BPN}/themes \
    ${datadir}/${BPN}/sounds \
"
