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
SRC_URI[md5sum] = "08a522a71937c71219202a4579bf41db"
SRC_URI[sha256sum] = "3ae1ff30f41a604fb80231da88b008ac8dc10f61a2b6a6c863f0607c275015d1"

RDEPENDS_${PN} = "sddm"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
