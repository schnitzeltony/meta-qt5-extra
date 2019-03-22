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
SRC_URI[md5sum] = "b3bcf028c519b6a6daabfc71055d4ca8"
SRC_URI[sha256sum] = "0190fff4930213b2e32d5d76750af784f45f89046d239da466dc5c9f625ec05b"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/symbols1000.dat \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/themes \
    ${datadir}/${BPN}/sounds \
"
