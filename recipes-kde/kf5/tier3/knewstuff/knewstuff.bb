SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += " \
    karchive \
    kauth-native \
    kcompletion \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kiconthemes \
    kio \
    kitemviews \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    attica \
    sonnet-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c941d34b251e12edb8dbe2170c5f6806"
SRC_URI[sha256sum] = "64744c6775c839d9d8216c4a81161df5544e113570b4cee8533b5a9b4c7b36f2"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
