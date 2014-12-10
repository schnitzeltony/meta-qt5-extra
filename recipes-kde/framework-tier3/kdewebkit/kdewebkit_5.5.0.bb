SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += " \
	qtwebkit \
	kconfig \
	kcoreaddons \
	kio \
	kjobwidgets \
	kparts \
	kservice \
	kwallet \
"

SRCREV = "7d2f1b400c72f6c7f4b3d140ebae6826b0332dca"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
