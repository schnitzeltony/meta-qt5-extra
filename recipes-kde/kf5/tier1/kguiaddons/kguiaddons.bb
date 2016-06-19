SUMMARY = "Addons to QtGui"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e910e142696eec33aec7f57fce6efba5"
SRC_URI[sha256sum] = "234bc39d79a06ead5b586a84e60edd821093ff8b24b0c94f0a1db13379f31d2d"

CMAKE_ALIGN_SYSROOT[1] = "KF5GuiAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5GuiAddons, -S${includedir}, -S${STAGING_INCDIR}"

