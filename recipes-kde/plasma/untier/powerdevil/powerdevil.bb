SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += " \
    sonnet-native \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    kdoctools-native \
    kcmutils-native \
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
    plasma-workspace \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "a48c550f6e6605d94310343c3b79d1c913a006ab76f1b6641515131bd3437900"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "upower"
