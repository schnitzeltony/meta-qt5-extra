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
SRC_URI[md5sum] = "5c4aecfb11e93e87e42bda24aefc6be9"
SRC_URI[sha256sum] = "6f48c21a0156db0a4a8679b5368501bddac059c3cc563ec5d30f95966e4191ba"
PV = "1.7.4"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/symbols1000.dat \
    ${datadir}/${BPN}/themes \
    ${datadir}/${BPN}/sounds \
"
