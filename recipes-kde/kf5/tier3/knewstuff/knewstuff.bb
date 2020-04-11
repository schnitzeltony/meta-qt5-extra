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
SRC_URI[md5sum] = "311745dc72c9ed55b32e1bfa028b9f19"
SRC_URI[sha256sum] = "21862f8abebbfe3ae59ce5bfce9c85e72d4b962abcde6bb3f384beeacdd89cf5"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
