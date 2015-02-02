SUMMARY = "Document centric plugin system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += " \
	kconfig \
	kcoreaddons \
	ki18n \
	kiconthemes \
	kio \
	kjobwidgets \
	knotifications \
	kservice \
	ktextwidgets \
	kwidgetsaddons \
	kxmlgui \
"

SRCREV = "e979067f95c4f9c1a841631d52b8cced588f83f0"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Parts, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Parts, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug"
