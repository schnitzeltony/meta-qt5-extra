SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "841740260585143afbdf6240289cce31"
SRC_URI[sha256sum] = "9d551fb9a0813f2df5563856d4e7e40665e59d6b42cba80d36cb42772fe8f7ce"

CMAKE_ALIGN_SYSROOT[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

