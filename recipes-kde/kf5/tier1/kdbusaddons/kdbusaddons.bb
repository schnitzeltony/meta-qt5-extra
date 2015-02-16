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
SRC_URI[md5sum] = "b328dd1478fa5fd3a1e65b299cc7062a"
SRC_URI[sha256sum] = "7b64c858e8871ab2deb6739c9a6aae79e634f8fc34043f46025341cbbd57c5ae"

CMAKE_HIDE_ERROR[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

