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
SRC_URI[md5sum] = "5c376c9f3390341071bcd6ec134243b3"
SRC_URI[sha256sum] = "accc8b7cb664c3f8e1c9e19f98d95134fdd2f4f57bc5b0483ed51a7c8c24abe8"

FILES_${PN} += "${datadir}/kxmlgui5"
