SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "74a4d0ecd28444306eb2fc9ea5af8ec7"
SRC_URI[sha256sum] = "f007cdd8235bfa255ba09ed3ac15b97dfdfc1733f47e0490f678260573f022e9"

CMAKE_ALIGN_SYSROOT[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

