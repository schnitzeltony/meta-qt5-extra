SUMMARY = "KDE SystemLog Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kxmlgui \
    kcoreaddons \
    kwidgetsaddons \
    kitemviews \
    kio \
    kconfig \
    karchive \
    kdoctools \
    kcompletion \
    ktextwidgets \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ff692ae5a71862ffc40eba8296470083"
SRC_URI[sha256sum] = "06c1ef9378ac0477247627a2d0f1dfd659cbb5f76da790e17199d9ba3fc35c56"

FILES_${PN} += "${datadir}/kxmlgui5"
