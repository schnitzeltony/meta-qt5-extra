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
SRC_URI[sha256sum] = "17a2118d1f41025af743f8f9de88188388724f69fe657416ec2158d98ef5b53a"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
