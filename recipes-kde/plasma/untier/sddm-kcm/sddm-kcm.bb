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
SRC_URI[md5sum] = "f1bb8fddb7e34ad3f4d38f02bb989461"
SRC_URI[sha256sum] = "3ab6da7692df4b35c088f45657dfe2430797021c7c7fd6091747d7fd9ca594d7"

RDEPENDS_${PN} = "sddm"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
