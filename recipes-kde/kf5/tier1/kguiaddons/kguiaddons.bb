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
SRC_URI[md5sum] = "bfba32b6ee6f1288fef0d7156bf81961"
SRC_URI[sha256sum] = "136cb22285eeb7e15a02cdcc8e8bc65edc777dd923125bd64695eb10c9ff5d9f"

CMAKE_ALIGN_SYSROOT[1] = "KF5GuiAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5GuiAddons, -S${includedir}, -S${STAGING_INCDIR}"

