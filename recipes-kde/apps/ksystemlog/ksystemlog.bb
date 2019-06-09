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
SRC_URI[md5sum] = "dade248f416ff9bb497e9829ae0935ae"
SRC_URI[sha256sum] = "0a875c5ec3b8cc4fc68a26804906993f37e4fbcdf0b2966f6a06c5d7ded0bad4"

FILES_${PN} += "${datadir}/kxmlgui5"
