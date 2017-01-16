SUMMARY = "KDE File Manager"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += " \
    kdoctools \
    kinit \
    kcmutils \
    knewstuff \
    kcoreaddons \
    ki18n \
    kdbusaddons \
    kbookmarks \
    kconfig \
    kio \
    kparts \
    solid \
    kiconthemes \
    kcompletion \
    ktexteditor \
    kwindowsystem \
    knotifications \
    kactivities \
    phonon \
    baloo \
    baloo-widgets \
    kfilemetadata \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "149165d7954bfef08747e5bb7252a277"
SRC_URI[sha256sum] = "b02bbfbe6d3f8eef6a6fd9b6ff6f5e90b47ad27c9f2e7ebcd25346287490fa6e"
SRC_URI += " \
    file://0001-align-paths-to-phonon.patch \
    file://0002-fix-build-for-qtbase-without-session-management.patch \
"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
