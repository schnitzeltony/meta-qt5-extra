SUMMARY = "KSE sysguard library"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtwebkit \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kcoreaddons \
    kconfig \
    ki18n \
    kwindowsystem \
    kcompletion \
    kwidgetsaddons \
    kiconthemes \
    kconfigwidgets \
    kservice \
    plasma-framework \
    knewstuff \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "a8a5635c88559567342eba77c707269ab23bc0ce1775ce424c0abd57a83e5d6c"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
