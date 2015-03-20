SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma cmake-lib

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
    kdelibs4support \
    kcrash \
    libksysguard \
    libkscreen \
    kwayland \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver libsm libxcb kwin", "", d)} \
    zlib \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "29694a2c8b43cf269ab89a50fb0e917e"
SRC_URI[sha256sum] = "c3dca77ea4deb872cf5225f5982055cf71fda3d63ff6cd08ab11215770d0b451"

SRC_URI += " \
    file://0001-Initial-Wayland-support.patch \
    file://0002-Initial-Wayland-support-II.patch \
    file://0003-Initial-Wayland-support-III.patch \
    file://0004-Initial-Wayland-support-IV.patch \
    file://0005-Initial-Wayland-support-V.patch \
    \
    file://0006-HACK-enable-task_wayland.cpp-stub-for-non-x11-builds.patch \
    \
    file://0007-Do-check-for-kwin-only-in-case-X11-was-found.patch \
    file://0008-Stub-down-sessionrunner-in-x11-less-environments.patch \
    file://0009-dataengines-mouse-fix-build-in-X11-less-environments.patch \
    file://0010-fix-missuse-of-HAVE_X11.patch \
    \
    file://0011-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    \
    file://0012-align-phonon-path.patch \
    file://0013-fix-paths-in-startkde.patch \
    file://0014-startkde-add-meta-qt5-standard-binary-path-to-PATH.patch \
    file://0015-startkde-fix-path-for-start_kdeinit_wrapper.patch \
"

# Notes on patches
# 0001 stolen from http://quickgit.kde.org/?p=clones%2Fplasma-workspace%2Fpierluigifiorini%2Fwayland.git&a=shortlog&h=8ce24d3c1cc9b3fe2ced19e7dec8c24c7ddc1173
# 0002-0006 are neccessary for x11-less wayland
# 0007 taskmanager stub either X11 or wayland

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LibKWorkspace, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LibKWorkspace, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "LibTaskManager, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[4] = "LibTaskManager, -S${includedir}, -S${STAGING_INCDIR}"

# REVISIT
FILES_${PN} += " \
    ${datadir} \
    ${libdir}/libkdeinit5*.so \
    ${libdir}/plugins \
    ${libdir}/qml \
"
FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/*/.debug \
    ${libdir}/plugins/*/*/.debug \
    ${libdir}/qml/org/kde/*/*/.debug \
    ${libdir}/qml/org/kde/*/*/*/.debug \
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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xsetroot xmessage", "", d)} \
"
