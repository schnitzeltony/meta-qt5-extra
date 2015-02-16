SUMMARY = "KHTML"
LICENSE = "GPLv3 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake-lib perlnative

DEPENDS += " \
    karchive \
    kcodecs \
    kglobalaccel \
    ki18n \
    kiconthemes \
    kio \
    kjs \
    knotifications \
    kparts \
    sonnet \
    ktextwidgets \
    kwallet \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    phonon \
    jpeg \
    giflib \
    libpng \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e7467a0a2af4147e98f285f65e5aa7c1"
SRC_URI[sha256sum] = "260ab3bfd6214e3d03fc1c58a22bad05f964ebef3f77f8448145736b3e46993a"

CMAKE_HIDE_ERROR[1] = "KF5KHtml, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5KHtml, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/kf5/*/.debug \
"
