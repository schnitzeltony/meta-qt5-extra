SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    kconfig-native \
    ki18n \
    kxmlgui \
    kauth-native \
    kconfigwidgets \
    kio \
    knewstuff \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcursor libxcb virtual/libx11", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "90ce63c74d4cebd77f828b5c59a02c03"
SRC_URI[sha256sum] = "4ff7cf23bd2f132c1cdf122564fdf85934fd268da27f60517bbc0ea02d81c72d"

RDEPENDS_${PN} = "sddm"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
