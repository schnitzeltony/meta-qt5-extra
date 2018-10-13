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
SRC_URI[md5sum] = "6a065a51fa112d0d59358d68f8d8aceb"
SRC_URI[sha256sum] = "2c7d11b0cb7d6cb270925c677d6617b751754081d637759e6a5befe9d6990f70"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
