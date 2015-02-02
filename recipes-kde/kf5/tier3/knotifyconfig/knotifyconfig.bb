SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += " \
	phonon \
	kcompletion \
	kconfig \
	ki18n \
	kio \
	kservice \
	kconfigwidgets \
	knotifications \
	kwidgetsaddons \
	kxmlgui \
"

SRCREV = "85e224e073a825e3d789408417b16f80a8ddd231"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NotifyConfig, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NotifyConfig, -S${includedir}, -S${STAGING_INCDIR}"
