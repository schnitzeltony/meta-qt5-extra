SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2a3eb21a34091008c75e87146320a324"
SRC_URI[sha256sum] = "451d72f80c37a88d105ca5ee251afffef27dd0166b6e7f85f372ab1be2c5ca57"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
