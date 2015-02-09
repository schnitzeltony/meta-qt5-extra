SUMMARY = "KDE Plasma Desktop"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    libcanberra \
    \
    qtsvg \
    qtdeclarative \
    \
    kauth \
    plasma-framework \
    kdoctools \
    ki18n \
    kcmutils \
    knewstuff \
    kdelibs4support \
    knotifyconfig \
    attica \
    kwallet \
    krunner \
    plasma-workspace \
    kwin \
    kitemmodels \
    kemoticons \
    baloo \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver libxcb qtx11extras", "", d)} \
"

# REVISIT optionals: find_package(PackageKitQt5 0.9)
DEPENDS += " \
    kactivities \
    libusb1 \
    fontconfig \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "476bc7465f8615b932696c9721453d26"
SRC_URI[sha256sum] = "e922c64a1d5e78d83006a45a74dd3656266301b3e5a8e00a9fe85ca4fa3c8d76"

SRC_URI += "file://0001-fix-path-to-fontinst.patch"

FILES_SOLIBSDEV = "${libdir}/libkfont*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/k* \
    ${datadir}/config.kcfg \
    ${datadir}/color-schemes \
    ${datadir}/plasma \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/polkit-1 \
    ${datadir}/solid \
    \
    ${libdir}/libkdeinit5_kaccess.so \
    ${libdir}/qml \
    ${libdir}/kauth \
    ${libdir}/plugins \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/qml/org/kde/*/*/*/.debug \
"
