SUMMARY = "A powerful BitTorrent client"
LICENSE = "GPLv2"
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

PV = "5.2.0"
SRC_URI = "https://download.kde.org/stable/ktorrent/${PV}/${BP}.tar.xz"
SRC_URI[sha256sum] = "d1031d745c1ace02d11b59c426610aee779d208e3d1ae81f8559c265173732ff"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
