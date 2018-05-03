SUMMARY = "Rosegarden is a music composition and editing environment"
HOMEPAGE = "http://www.rosegardenmusic.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b33ec9f109e9943af917779ba6ec522e"

DEPENDS += " \
    qttools-native \
    qtbase \
    qtx11extras \
    virtual/libx11 \
    jack \
    dssi \
    zlib \
    lrdf \
"

inherit cmake_qt5 pkgconfig gtk-icon-cache distro_features_check mime

REQUIRED_DISTRO_FEATURE = "x11"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/17.12/${BPN}-${PV}.tar.bz2 \
"
SRC_URI[md5sum] = "13022c54af94024f5304927d7c40e797"
SRC_URI[sha256sum] = "af0606cd447213a0aaa3404c7bf1589d648039eab5b29338d89817f4fac2b394"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"
