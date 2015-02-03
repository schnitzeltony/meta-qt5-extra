SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base cmake-lib

SRC_URI += " \
    file://0001-CMakeLists.txt-add-pkg-config-as-fallback-for-Waylan.patch \
    file://0002-PlasmaShell-and-PlasmaSurface-interfaces.patch \
    file://0003-PlasmaEffects-interface.patch \
    file://0004-Server-side-interface.patch \
"

# TODO come back to mainline
SRCREV = "bc9ab6731700eabf17e1b193d13c904f68f7ebe0"
S = "${WORKDIR}/git"
PV = "5.1.90+git${SRCPV}"

DEPENDS += "wayland wayland-native"

CMAKE_HIDE_ERROR[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



