SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "29512139354cbfcad8d6bd34db59c2ea"
SRC_URI[sha256sum] = "2430f22e193904c1ebe1d8b9039ab73ec3fed0993e8365981d430f1a94b395af"

CMAKE_ALIGN_SYSROOT[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

