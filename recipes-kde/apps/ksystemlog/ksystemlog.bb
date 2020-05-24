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
SRC_URI[md5sum] = "a3be8a089f9bee4094edd8f975fa1470"
SRC_URI[sha256sum] = "d16ad8b37a5a751ec8c5a72b6738a7cffacdd2698246ec3f6f9d6eeb138246a0"

FILES_${PN} += "${datadir}/kxmlgui5"
