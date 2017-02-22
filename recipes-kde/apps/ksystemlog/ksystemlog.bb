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
SRC_URI[md5sum] = "7ab1242e587f1839f48b116a2bfe9720"
SRC_URI[sha256sum] = "a484000c082719a290b07b3f557e5dda47cb7be96d9b1f23445e5e0afd80028f"

FILES_${PN} += "${datadir}/kxmlgui5"
