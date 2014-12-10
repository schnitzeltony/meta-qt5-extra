SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	karchive \
	kcompletion \
	kconfig \
	kcoreaddons \
	ki18n \
	kiconthemes \
	kio \
	kitemviews \
	ktextwidgets \
	kwidgetsaddons \
	kxmlgui \
	attica \
"

SRCREV = "bb51cf99c76d3d334ef9272e2b9d6ee930b2329e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
