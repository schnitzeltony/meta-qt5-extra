DESCRIPTION = "Plasma Phone Components"
HOMEPAGE = "https://community.kde.org/Plasma/Mobile/Code"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

DEPENDS += " \
    kpackage-native \
    kauth-native \
    gstreamer1.0 \
    qtdeclarative \
    telepathy-qt \
    kpeople \
    plasma-framework \
    kdbusaddons \
    knotifications \
"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "ba4afbaa6e8ecf5461252f8124a0dad48e0d44c5bc8dbda990423b2916480792"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/kwin \
    ${datadir}/metainfo \
    ${datadir}/plasma \
    ${datadir}/sounds \
    ${datadir}/wallpapers \
    ${datadir}/wayland-sessions \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += " \
    libqofono \
    qtvirtualkeyboard-plugins \
    qtvirtualkeyboard-qmlplugins \
"

