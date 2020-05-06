DESCRIPTION = "Plasma Phone Components"
HOMEPAGE = "https://community.kde.org/Plasma/Mobile/Code"
LICENSE = "GPLv2 & LGPLv2.1"
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

SRC_URI += "file://0001-Make-build-of-dialer-optional.patch"
PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "af6d01e56794acc9ca9e721064878133"
SRC_URI[sha256sum] = "d0c091367ae07c71457a0c03d1023ac48d8665385a6a1b0e32f6ae7ad1fa7070"

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

