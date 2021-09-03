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
SRC_URI[sha256sum] = "356d55f28c52fe1c658c20da1c806c4b878d9fccf0ad269027c97fa2ed20fce4"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
