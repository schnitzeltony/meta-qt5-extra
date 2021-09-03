SUMMARY = "KDE SystemLog Application"
LICENSE = "GPL-2.0"
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
SRC_URI[sha256sum] = "bbb08a286fa4c20405b7cc3ddf65eb30746c06a3c5235c4146785d3bd6e260ef"

FILES:${PN} += "${datadir}/kxmlgui5"
