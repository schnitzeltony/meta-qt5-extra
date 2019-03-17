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
    file://0001-Do-not-set-lib-suffix-oe-will-take-care.patch \
"
SRC_URI[md5sum] = "a1fd83216f65619fea766dfc0a6f5266"
SRC_URI[sha256sum] = "367743764c8f5c6e40bb19b9581f083da2881b9c9516d6b3b247e5644dee7c2b"

EXTRA_OECMAKE = "-DLIB_SUFFIX=`echo ${baselib} | sed -e s/lib//`"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/icons \
"
