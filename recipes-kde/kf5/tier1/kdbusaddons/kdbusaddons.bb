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
SRC_URI[md5sum] = "f549e9e7c7340df301b52530817ced0a"
SRC_URI[sha256sum] = "1e7ba26008611977a21943e7e165028ad69122ffe6bf301cb1f6235532fd3901"

CMAKE_ALIGN_SYSROOT[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

