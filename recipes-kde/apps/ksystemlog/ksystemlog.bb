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
SRC_URI[md5sum] = "ca0d4d160b7ae3ba1c66f8660298167d"
SRC_URI[sha256sum] = "2703649b50162babac7db7438a7b363a8ca464a5d360ed93ba50876ec2a668e7"

FILES_${PN} += "${datadir}/kxmlgui5"
