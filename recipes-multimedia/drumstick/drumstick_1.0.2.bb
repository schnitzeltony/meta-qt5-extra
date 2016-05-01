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

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "f8e6d9de7943853146c39e52242cb705"
SRC_URI[sha256sum] = "34aab5812c35ba16f8e606632a56c38879f470e3e395d580412c73ef937f8750"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/icons \
"
