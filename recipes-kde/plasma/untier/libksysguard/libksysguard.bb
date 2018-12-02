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
    kauth \
    kwidgetsaddons \
    kiconthemes \
    kconfigwidgets \
    kservice \
    plasma-framework \
    kpackage-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8b43076fe3d8845d7f890721a90b8210"
SRC_URI[sha256sum] = "2233a024aa1d19c0f0d4142ae436df44cf98e0de3203da1a62556891779ad4d9"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
"
