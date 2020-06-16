SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    sonnet-native \
    karchive \
    kcompletion \
    kconfig \
    kcoreaddons \
    ki18n \
    kiconthemes \
    kio \
    kitemviews \
    ktextwidgets \
    kwidgetsaddons \
    kxmlgui \
    attica \
    kpackage \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c380f2e3522582f6f552db014000797"
SRC_URI[sha256sum] = "aba867855d69641f73db30405e787fc9ea22e3386a45be9626ba84cbe208f855"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
