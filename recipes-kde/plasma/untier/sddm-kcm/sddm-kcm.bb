SUMMARY = "Manages the power consumption settings of a Plasma Shell"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kcoreaddons \
    ki18n \
    kxmlgui \
    kconfigwidgets \
    kio \
    knewstuff \
    kcmutils \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcursor libxcb virtual/libx11", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "d0836035594ca006bc60d4410fbf1ca1224a15b8707b5281e2196e53bcc70977"

RDEPENDS:${PN} = "sddm"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/knsrcfiles \
    ${datadir}/kservices5 \
    ${datadir}/polkit-1 \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
