SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPL-2.0"
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
SRC_URI[sha256sum] = "597301e6520c17131c98a98960a1e3b7827e63ab9efed0fea5340203133f1c9f"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"

RDEPENDS:${PN} += "upower"
