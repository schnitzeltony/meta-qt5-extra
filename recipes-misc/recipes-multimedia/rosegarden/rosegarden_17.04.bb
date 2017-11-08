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
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
"
SRC_URI[md5sum] = "d3d80cc8e6eb3c7764a2905059acacce"
SRC_URI[sha256sum] = "988a6141c5b0a8e85c029f650de78bf57100c4d778c22d0194b0692584640ece"


FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/appdata \
"
