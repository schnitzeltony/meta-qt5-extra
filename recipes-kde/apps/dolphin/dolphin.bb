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
SRC_URI[md5sum] = "1e2a24008596df5a8df7a744953e8b95"
SRC_URI[sha256sum] = "a612dac0cf50301af46ad5fa29aad630bb33a8a4bd416a4d6023b65fb00f25cc"
SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-Revert-Make-target_link_libraries-for-kdeinit_dolphi.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/kglobalaccel \
    ${datadir}/dbus-1 \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
