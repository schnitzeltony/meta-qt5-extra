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
SRC_URI[md5sum] = "1060efca83c1f244b52c9ff5c3edd7df"
SRC_URI[sha256sum] = "cf241da3bdfa86b700c4fb7ccc7688129b3d33981ee599cf5c512d5bb1ccdc57"

FILES_${PN} += "${datadir}/kxmlgui5"
