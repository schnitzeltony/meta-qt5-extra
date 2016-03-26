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
SRC_URI[md5sum] = "351e8754f3d237aa890a845a6c559093"
SRC_URI[sha256sum] = "e9e46f5d5ee57adbf1348b0cac803ead5cd4717a501abf2d508c30ea57b62d66"

CMAKE_ALIGN_SYSROOT[1] = "KF5KHtml, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KHtml, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
