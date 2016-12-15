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
SRC_URI[md5sum] = "3c9c3a3e741353a4eca26df0e455e104"
SRC_URI[sha256sum] = "98f8d3ca7026d79e8f9be038efa121440c8df167ea8133404312289418516c60"

FILES_${PN} += "${datadir}/kxmlgui5"
