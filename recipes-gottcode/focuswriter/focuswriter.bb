SUMMARY = "FocusWriter is a simple, distraction-free writing environment"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = " \
    qttools-native \
    qtbase \
    qtmultimedia \
    hicolor-icon-theme \
    hunspell \
"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "1e12c067978a6eb2ef6d7677e84c9c56"
SRC_URI[sha256sum] = "b32029286c61de39ce6cba4ba6da0727e708e247161bcaf881408fca74664ee3"
PV = "1.7.2"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/symbols1000.dat \
    ${datadir}/${BPN}/themes \
    ${datadir}/${BPN}/sounds \
"
