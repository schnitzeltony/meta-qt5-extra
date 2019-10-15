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
SRC_URI[md5sum] = "3802dd3c22a4347fcf0299136d551705"
SRC_URI[sha256sum] = "ea0ebd64c9f315f890421ae2ff0d7d756b61071331868ff9a63e47a9cba59fe5"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "upower"
