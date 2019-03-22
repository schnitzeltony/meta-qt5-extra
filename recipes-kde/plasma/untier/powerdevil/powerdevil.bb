SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += " \
    bluez-qt \
    kactivities \
    kauth-native \
    kidletime \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    solid \
    ki18n \
    kglobalaccel \
    kio \
    knotifyconfig \
    kscreen \
    kdelibs4support \
    kdelibs4support-native \
    kdesignerplugin-native \
    sonnet-native \
    plasma-workspace \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "72da38b000b84ebb350b2842c22438bb"
SRC_URI[sha256sum] = "24acaef3e78b8cea665ca12ade119d8e589de74cc5bf0bdcc7398201e998f1b8"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "upower"
