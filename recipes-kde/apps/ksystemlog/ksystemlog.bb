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
SRC_URI[md5sum] = "147bd369420aa60473766a541208dcd5"
SRC_URI[sha256sum] = "163e0a9f46bd0250a60864f5e112fa74f81755f97f2cfb82c5a6e8dd10355e4a"

FILES_${PN} += "${datadir}/kxmlgui5"
