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
SRC_URI[md5sum] = "064408f4b6ad11372c903e396080e1bc"
SRC_URI[sha256sum] = "31b1b7eac1330d1a18806759a96f131a2de1aaf5ad160d3fc623eab167a881ab"

FILES_${PN} += "${datadir}/kxmlgui5"
