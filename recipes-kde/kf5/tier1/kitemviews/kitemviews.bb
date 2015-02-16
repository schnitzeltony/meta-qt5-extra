SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6c1ac3c1f806fc4223b0d098005218e6"
SRC_URI[sha256sum] = "0619256e295038173d7f028a281cd59ed8125599e61e492855046d7b248566c5"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ItemViews, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ItemViews, -S${includedir}, -S${STAGING_INCDIR}"
