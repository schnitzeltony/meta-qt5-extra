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
SRC_URI[md5sum] = "b7df8ce68cee3cdcbd9c96d513fbeae6"
SRC_URI[sha256sum] = "f17bc9cc0852c3a4433e1ffaeb88ad7af3611a9ec95409c391b39fa57e84da5d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
