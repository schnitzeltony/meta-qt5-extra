SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f261f5f1aff9bfce0abea333ce3aa89a"
SRC_URI[sha256sum] = "16152d3757618aa8bba4a5b52f93a1f6ce0e0cbbac12e958b3e4f0e0aa348b1d"

SRC_URI += "file://0001-align-path-to-drkonqi.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
