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
SRC_URI[sha256sum] = "641a167a58856e99036d44b3e7472b44cdfbbf68e5d75b9af988d0b71dc10af4"
