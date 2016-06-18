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
SRC_URI[md5sum] = "2b6d93cef9c33a2b2e5b7fe1bfe9b3b1"
SRC_URI[sha256sum] = "df06f31f788304518c5fc87b24d199aaa2f187a33b36475214b7fbeaa0ebe444"

FILES_${PN} += "${datadir}/kxmlgui5"
