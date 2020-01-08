SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += " \
    sonnet-native \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kdoctools-native \
    bluez-qt \
    kactivities \
    kidletime \
    kconfig \
    solid \
    ki18n \
    kglobalaccel \
    kio \
    knotifyconfig \
    kscreen \
    kdelibs4support \
    plasma-workspace \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b43d9cc5ed9d43c187bf65d329668d4d"
SRC_URI[sha256sum] = "27904361e85e1267d933d8f0a0d3be4dc712099ed2eb3cf90959209a4443dd82"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "upower"
