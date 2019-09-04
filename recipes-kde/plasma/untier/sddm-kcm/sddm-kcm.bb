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
SRC_URI[md5sum] = "c8ec664a7e6a23e92da49d29a021e940"
SRC_URI[sha256sum] = "4220d18f1a04c767649bffee1aed6c2b2c12c60cd7d6ca6fabc3dbec1ec3f127"

RDEPENDS_${PN} = "sddm"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
