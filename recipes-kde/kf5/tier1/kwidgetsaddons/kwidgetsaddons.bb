SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "44c43dd0430cfc2e7b83331c63d74613"
SRC_URI[sha256sum] = "4385540afdf74f696271dbf78a34a1c5e9509094a6a201b96f3a9471f98cfe6f"

CMAKE_ALIGN_SYSROOT[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

