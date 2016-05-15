SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e7f28cb6abcc9d5287c7682ca5b7d67b"
SRC_URI[sha256sum] = "0f9f5e024f98b9cb71c8262108e58814eb62c72a556a0da1fbd7cb329f4d11e4"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
