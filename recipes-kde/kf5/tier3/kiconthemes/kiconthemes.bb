SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRCREV = "2286886decfec2b1a956b813b4c078c38bc2f43b"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
