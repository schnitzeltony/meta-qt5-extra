SUMMARY = "KSudoku is a logic-based symbol placement puzzle"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache features_check

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
SRC_URI[md5sum] = "9877dd40570207fbf455ea08a5ed1681"
SRC_URI[sha256sum] = "4dd72a5b0bb0c951508bbe2c60ce280efcd0414899e025a2ca4d92336576ec2a"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
