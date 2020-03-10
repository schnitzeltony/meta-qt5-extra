SUMMARY = "A powerful BitTorrent client"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

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

PV = "5.1.2"
SRC_URI = "https://download.kde.org/stable/ktorrent/${PV}/${BP}.tar.xz"
SRC_URI[md5sum] = "d917be1111bcdaea27feba3fc707c219"
SRC_URI[sha256sum] = "641427a3d6ecb18b0b28c1cc2ec3ba54612abf684df5e10e6c953cd7af058d4f"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
