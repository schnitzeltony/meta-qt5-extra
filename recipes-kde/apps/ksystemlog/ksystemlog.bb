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
SRC_URI[md5sum] = "cfe019ab167dbac71ede998e0899d2c4"
SRC_URI[sha256sum] = "6d9c37a09b8bf79ddeb0b4347040770116b0cc74a38779431d19fd972cdd4973"

FILES_${PN} += "${datadir}/kxmlgui5"
