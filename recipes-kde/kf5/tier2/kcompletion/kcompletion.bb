SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "821eef72d69c49cf5afd0a7793db9f70"
SRC_URI[sha256sum] = "d0f9fd0b18953943c50f56680d95c0f62dc39a096f5a6961adedcc96d11218b5"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
