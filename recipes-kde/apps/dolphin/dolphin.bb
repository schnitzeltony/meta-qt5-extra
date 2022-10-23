SUMMARY = "KDE File Manager"
LICENSE = "GPL-2.0-only & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext mime-xdg

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcmutils-native \
    sonnet-native \
    \
    kinit \
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
SRC_URI[sha256sum] = "39f2ee237ee5e62baf05e3798d8512e01a7d40276fca03488e256c6e30543b56"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/kglobalaccel \
    ${datadir}/knsrcfiles \
    ${datadir}/dbus-1 \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
