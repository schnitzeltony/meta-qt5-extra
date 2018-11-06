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
    qtdeclarative \
    telepathy-qt \
    kpeople \
    plasma-framework \
    kdbusaddons \
    knotifications \
"

inherit kde-plasma gettext

SRC_URI = " \
    git://anongit.kde.org/${BPN} \
    file://0001-Make-build-of-dialer-optional.patch \
"
SRCREV = "306512efe93f925b5e5f35cac0eb76b6ba7afa77"
S = "${WORKDIR}/git"
# Did not find version anywhere
PV = "0.0.0++git${SRCPV}"

FILES_${PN} += " \
    ${datadir}\kservices5 \
    ${datadir}\kwin \
    ${datadir}\metainfo \
    ${datadir}\plasma \
    ${datadir}\sounds \
    ${datadir}\wallpapers \
    ${datadir}\wayland-sessions \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += " \
    libqofono \
    qtvirtualkeyboard-plugins \
    qtvirtualkeyboard-qmlplugins \
"

