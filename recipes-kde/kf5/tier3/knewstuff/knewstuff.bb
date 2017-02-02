SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += " \
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
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "914fc8d7aa78c12c1ffd89b041772799"
SRC_URI[sha256sum] = "2f19359286631831e4090d1a9448cfb72ac037b2fb76c5fe8a9694861b4a30eb"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/org/kde/newstuff \
"
