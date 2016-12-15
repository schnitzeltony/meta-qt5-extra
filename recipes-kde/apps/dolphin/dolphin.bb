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
SRC_URI[md5sum] = "e41e3cd979ae0db3f6b38e14038f3a3c"
SRC_URI[sha256sum] = "9b2c126b9da78f466716e813cecfa5fbc8df9733ddc832099541c87bdaa5df37"
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
