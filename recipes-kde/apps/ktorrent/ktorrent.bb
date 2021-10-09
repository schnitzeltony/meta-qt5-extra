SUMMARY = "A powerful BitTorrent client"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kdoctools-native \
    libktorrent \
    knotifyconfig \
    kcmutils \
    kparts \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "71c779694f88c5fdd71e19a96bcb833195dbdb48beb521da521330bd9914a7d9"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
