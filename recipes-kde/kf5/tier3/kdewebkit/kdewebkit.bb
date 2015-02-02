SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

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

SRCREV = "a4727611d297f7776c4ea67d521ff6e932843e3b"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5WebKit, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WebKit, -S${includedir}, -S${STAGING_INCDIR}"
