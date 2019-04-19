SUMMARY = "KSudoku is a logic-based symbol placement puzzle"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11 opengl"

DEPENDS += " \
    libglu \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kconfigwidgets \
    kcrash \
    kguiaddons \
    ki18n \
    kiconthemes \
    kio \
    kjobwidgets \
    kwidgetsaddons  \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "945971a3e47bddd5119657384ea94418"
SRC_URI[sha256sum] = "4f5cff274741326bff02108fef4996f289c56ff026fd6e2921e4a2bf492a14cb"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
