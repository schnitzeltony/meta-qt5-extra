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
SRC_URI[md5sum] = "1dfd4dc13b50bb030112a9fe9ce4ec4a"
SRC_URI[sha256sum] = "2c8e27aa763c5af2877fb5f3aa0816706e3a85da49727d792e6f7920a032e945"

CMAKE_ALIGN_SYSROOT[1] = "KF5GuiAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5GuiAddons, -S${includedir}, -S${STAGING_INCDIR}"

