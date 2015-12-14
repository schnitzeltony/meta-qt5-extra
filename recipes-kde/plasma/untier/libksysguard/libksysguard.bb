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
SRC_URI[md5sum] = "3dfcf5648147396ca2c180ec8e427dc2"
SRC_URI[sha256sum] = "2826e8c2f68a8c28a9100d566ac2aa5eb5b00ece664e1b35711271cb938356dc"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5SysGuard, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5SysGuard, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} ${libdir}/kauth"
FILES_${PN}-dbg += "${libdir}/kauth/.debug"
