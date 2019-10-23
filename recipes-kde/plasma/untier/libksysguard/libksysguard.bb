SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtwebkit \
    kauth-native \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    ki18n \
    kwindowsystem \
    kcompletion \
    kwidgetsaddons \
    kiconthemes \
    kconfigwidgets \
    kservice \
    plasma-framework \
    kpackage-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8283b3ecbd892ab4f395428e4893df85"
SRC_URI[sha256sum] = "b0f9e057d4b1424c56958e0f2d1af9cd88081277d8785e616df6a55f19539f81"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
"
