SUMMARY = "KDE SystemLog Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    kxmlgui \
    kwidgetsaddons \
    kitemviews \
    kio \
    karchive \
    kcompletion \
    ktextwidgets \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ca0180f7fc101672b7daeb1a0db7bbac"
SRC_URI[sha256sum] = "a194fcbb50cc270d34b28b7aa9bfa8e1129dfecf1f890f72d366eecb948ed553"

FILES_${PN} += "${datadir}/kxmlgui5"
