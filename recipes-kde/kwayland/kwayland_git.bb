DESCRIPTION = "Reading, creating, and manipulating file archives"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRC_URI += " \
    file://0001-CMakeLists.txt-add-pkg-config-as-fallback-for-Waylan.patch \
"
SRCREV = "fe9ba06a103015b6964c1f4ed322b78bf41acaec"
PV = "5.1.90+git${SRCPV}"

DEPENDS += "wayland wayland-native"

CMAKE_HIDE_ERROR[dir1] = "KF5Wayland/KF5WaylandTargets.cmake, -cccoutforoe filecheckloop"
CMAKE_HIDE_ERROR[dir2] = "KF5Wayland/KF5WaylandTargets.cmake, -S${includedir}/KF5/KWayland/Client;${includedir}/KF5;${includedir}/KF5, -S${includedir}, -S${STAGING_INCDIR}"


