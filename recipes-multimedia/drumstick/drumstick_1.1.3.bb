SUMMARY = "C++/Qt5 wrapper around multiple MIDI interfaces"
HOMEPAGE = "http://drumstick.sourceforge.net"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d9d415d3d8c5523e5586ff7b785095f1"

inherit cmake_qt5 pkgconfig mime mime-xdg gtk-icon-cache

DEPENDS += " \
    qtbase \
    qtsvg \
    fluidsynth \
"
SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[sha256sum] = "75aca4281da25fe0186b44c07772c5f0b4d1f2bba875c4667e7e6e9fcedb3cd9"

FILES:${PN} += " \
    ${datadir}/mime \
    ${datadir}/icons \
"
