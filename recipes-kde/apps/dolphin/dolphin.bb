SUMMARY = "KDE File Manager"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    \
    kinit \
    kcmutils \
    knewstuff \
    ki18n \
    kdbusaddons \
    kbookmarks \
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
SRC_URI[md5sum] = "49a0ec82b4dcfa3f61358d8adcfb7828"
SRC_URI[sha256sum] = "67a2b283049591fa0f00304b4da6532e9d59d9dc9067916e0ffe8aa19d93f579"
SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-Revert-Make-target_link_libraries-for-kdeinit_dolphi.patch \
"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
