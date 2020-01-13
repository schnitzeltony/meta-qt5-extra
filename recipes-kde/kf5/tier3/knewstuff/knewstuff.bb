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
SRC_URI[md5sum] = "7dd0129747ae0a4b5e51a2e89ee96c12"
SRC_URI[sha256sum] = "acef94661e3a0e42938224c17b90f835d6686d88a25698fe82980d7e1139b1fe"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
