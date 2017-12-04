SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma gettext

DEPENDS += " \
    bluez-qt \
    kactivities \
    kauth \
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
SRC_URI[md5sum] = "85616354c53b934752f221b4d89cd3dc"
SRC_URI[sha256sum] = "327bfe3d5d0466ddd406784332a33ffedb2f85c515565b310f1bebb23bb2cc32"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"

RDEPENDS_${PN} += "upower"
