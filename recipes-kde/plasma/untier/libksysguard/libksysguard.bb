SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    qtwebkit \
    kcoreaddons \
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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7eebe0d746a23b6a40b29c70c64ec847"
SRC_URI[sha256sum] = "771c487cce44e64040fa976ff038972ee2099d1f9b39839f8d712ca373e42fd1"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
"
