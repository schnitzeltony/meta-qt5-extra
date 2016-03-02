SUMMARY = "KSE sysguard library"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

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
    kauth \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI += "file://0001-signalplotter-Use-std-namespaced-isnan-and-isinf.patch"
SRC_URI[md5sum] = "ff6c11140a83928c7b240ced2f06b3e8"
SRC_URI[sha256sum] = "4286691ad71f104b54ab5d9cdd8cb8c153984308a4bd998012ea01d36a377e9a"


# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5SysGuard, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5SysGuard, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
    ${libdir}/kauth \
"
FILES_${PN}-dbg += "${libdir}/kauth/.debug"
