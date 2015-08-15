SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma cmake-lib distro_features_check

DEPENDS += " \
    baloo \
    kdeclarative \
    plasma-framework \
    kconfig \
    kactivities \
    krunner \
    kjsembed \
    knotifyconfig \
    kdesu \
    knewstuff \
    kwallet \
    kcmutils \
    kidletime \
    kdeclarative \
    kdewebkit \
    ktextwidgets \
    ktexteditor \
    kdelibs4support \
    kxmlrpcclient \
    kcrash \
    networkmanager-qt \
    libksysguard \
    libkscreen \
    kwayland \
    libdbusmenu-qt5 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver libsm libxcb kwin", "", d)} \
    zlib \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3d6a6e1ffcbf2d3e27668dc471523907"
SRC_URI[sha256sum] = "4165a547efc59dd42a15d24f21f722d88e4acfb6fb6d6a4db3c3d0ce54fa54c4"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    \
    file://0002-align-phonon-path.patch \
    file://0003-fix-paths-in-startkde.patch \
    file://0004-startkde-add-meta-qt5-standard-binary-path-to-PATH.patch \
    file://0005-startkde-fix-path-for-start_kdeinit_wrapper.patch \
    file://0006-startkde-create-kde-s-home.patch \
    file://0007-startkde-enable-starting-X.patch \
    \
    file://0008-BalooRunner-Baloo-Result-header-is-no-longer-install.patch \
    file://0009-Baloo-Runner-Use-the-filepath-as-the-unique-id-of-th.patch \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LibKWorkspace, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LibKWorkspace, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "LibTaskManager, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[4] = "LibTaskManager, -S${includedir}, -S${STAGING_INCDIR}"

# REVISIT
FILES_${PN} += " \
    ${datadir} \
    ${libdir}/libkdeinit5*.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/*/.debug \
"

FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/cmake \
    ${libdir}/libkworkspace5.so \
    ${libdir}/libweather_ion.so \
    ${libdir}/libplasma-geolocation-interface.so \
    ${libdir}/libtaskmanager.so \
"

# startkde requires:
RDEPENDS_${PN} += " \
    qttools-tools \
    kconfig-bin \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xsetroot xmessage", "", d)} \
"
