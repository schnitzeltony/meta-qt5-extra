SUMMARY = "Document centric plugin system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

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

SRCREV = "7784c69b3306ada9c0242b2112743f59edf74a50"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Parts, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Parts, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5 ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/.debug"
