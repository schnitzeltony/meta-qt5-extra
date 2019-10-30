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
SRC_URI[md5sum] = "be18a0b78f1db609caa954f24fd8e1ad"
SRC_URI[sha256sum] = "7d4fa8ca098586d48e96e15a35183df9cd1060f2a0ec49f66423600e53355478"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
"
