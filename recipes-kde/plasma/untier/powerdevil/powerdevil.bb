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
SRC_URI[md5sum] = "324993f005539700603c9b8203950aea"
SRC_URI[sha256sum] = "ec0ed6826514b71c0ae0fb05072e33dd1f284ed84b5f78dff3df267d7a02c28c"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "upower"
