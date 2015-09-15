SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c0bff34af9beb98133342541cc0ef1cd"
SRC_URI[sha256sum] = "5bf08e2b4c8454a541be332334a1742dd2f79c8683c7a3a9141f9fe248f9196f"

CMAKE_ALIGN_SYSROOT[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

