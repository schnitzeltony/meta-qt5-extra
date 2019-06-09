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
SRC_URI[md5sum] = "251e910ae22b4287aa2ab8a58f2968b0"
SRC_URI[sha256sum] = "fbefe46039db31568a6f48dce7b0ed0e6c9287b0bb34170510cd37a01e0b7275"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
