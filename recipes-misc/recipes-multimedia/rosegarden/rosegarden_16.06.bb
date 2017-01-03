SUMMARY = "Rosegarden is a music composition and editing environment"
HOMEPAGE = "http://www.rosegardenmusic.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b33ec9f109e9943af917779ba6ec522e"

DEPENDS += " \
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
SRC_URI[md5sum] = "a8679dcd852a78eee064d8a4a4f4a961"
SRC_URI[sha256sum] = "1044334f2c1a2ac7560d80910e0721c8913bd924f8185a393f630c89020340db"


FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/appdata \
"
