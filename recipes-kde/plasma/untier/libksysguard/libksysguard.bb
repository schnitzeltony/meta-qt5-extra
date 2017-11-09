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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e8358812071f8fb3985edc164ec753e0"
SRC_URI[sha256sum] = "be7ea8f477b1da083b4a5a9812e3062300b48adea53aa79697d1b41fac686cc9"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
"
