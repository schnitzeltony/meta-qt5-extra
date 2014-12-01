SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

SRCREV = "fb7d6d09c5e2c4156138d9dd5b897881225cfe41"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5TextWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5TextWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
