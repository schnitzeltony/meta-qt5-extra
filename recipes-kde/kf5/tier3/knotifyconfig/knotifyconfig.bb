SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    phonon \
    kauth-native \
    kcoreaddons-native \
    kcompletion \
    kconfig \
    kconfig-native \
    ki18n \
    kio \
    kservice \
    kconfigwidgets \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "fd66b8e21f9dda2b8b103497e169648712f0eff31cc189dd8f26feb90e16e4a3"
