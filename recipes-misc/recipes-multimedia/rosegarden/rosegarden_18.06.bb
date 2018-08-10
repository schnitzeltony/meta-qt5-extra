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
SRC_URI[md5sum] = "f996a0e2f1c2d650d980883bdb27363c"
SRC_URI[sha256sum] = "a777c852c8905df7efbadcebea7fa7300d8bf1865ed581af20518a8535400c13"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"
