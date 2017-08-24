SUMMARY = "C++/Qt5 wrapper around multiple MIDI interfaces"
HOMEPAGE = "http://drumstick.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d9d415d3d8c5523e5586ff7b785095f1"

inherit cmake_qt5 pkgconfig mime gtk-icon-cache

DEPENDS += " \
    qtbase \
    qtsvg \
    fluidsynth \
"
SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
"
SRC_URI[md5sum] = "8b72ff32bbd3887c53b282a7111e683f"
SRC_URI[sha256sum] = "ae1d2c0d21b45d144e181b873ffbc2979a294fab31b8d71a5b0b8cad3276f38e"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/icons \
"
