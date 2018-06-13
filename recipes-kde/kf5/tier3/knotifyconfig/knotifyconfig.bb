SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

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
SRC_URI[md5sum] = "02c2eb067aa95cd5985c4bdef930ac4b"
SRC_URI[sha256sum] = "546b099c5257e2d59b92c0350415824754cba9f789d767d160bd2ea54b505b7d"
