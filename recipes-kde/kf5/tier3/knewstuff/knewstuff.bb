SUMMARY = "Support for downloading application assets from the network"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

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

SRCREV = "1ccdf90d041bd945bfd33e275f4f00b3ea51c4aa"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NewStuff, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NewStuff, -S${includedir}, -S${STAGING_INCDIR}"
