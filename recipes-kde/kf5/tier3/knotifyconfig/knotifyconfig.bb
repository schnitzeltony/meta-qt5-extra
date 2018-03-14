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
SRC_URI[md5sum] = "1e9206a15a8dac0c6e1777404dc2949b"
SRC_URI[sha256sum] = "3f85c46c7425c398162afb7de42c53d09cdbfbc7442082042a297b3a6be14204"
