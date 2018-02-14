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
    kauth \
    kauth-native \
    kconfigwidgets \
    kio \
    knewstuff \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcursor libxcb virtual/libx11", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "28a1ad02d32a6c0fbdfc9dc1822d5ded"
SRC_URI[sha256sum] = "be9d4e8ef2c39002357e95d7046e8a9b190d5d37a5126d360a032d2b250349c6"

RDEPENDS_${PN} = "sddm"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/kauth \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${libdir}/kauth/.debug \
"
