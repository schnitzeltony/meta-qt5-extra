SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "52c1e57e69e1c7cc9fb823907cd917b6"
SRC_URI[sha256sum] = "41861e29ace5ec4a8a4a3842c54aaa79d7db17e3aa848d0e6a7de6748e5c14e9"

CMAKE_ALIGN_SYSROOT[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

