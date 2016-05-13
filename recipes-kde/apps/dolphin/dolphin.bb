SUMMARY = "KDE File Manager"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps cmake-lib

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
SRC_URI[md5sum] = "a4e3daa271c15608ff5c29ce8a8936bf"
SRC_URI[sha256sum] = "31d90cdcdaecb384068bcaed870f3a1218df2dc4a010f851c15fb168fc28e0a5"
SRC_URI += " \
    file://0001-align-paths-to-phonon.patch \
    file://0002-fix-build-for-qtbase-without-session-management.patch \
"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/appdata \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "DolphinVcs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "DolphinVcs, -S${includedir}, -S${STAGING_INCDIR}"
