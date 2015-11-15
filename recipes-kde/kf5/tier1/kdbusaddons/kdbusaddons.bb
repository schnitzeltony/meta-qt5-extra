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
SRC_URI[md5sum] = "8217284ce9b3db03d30098f935a40f29"
SRC_URI[sha256sum] = "ea9b6c4059c0e4205347c6e72f2fe3f175eb1aebe32c1d6d822a7a1d617d6e7a"

CMAKE_ALIGN_SYSROOT[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

