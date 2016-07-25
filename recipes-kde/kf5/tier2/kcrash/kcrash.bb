SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "10119826a766faeda888c7a6125fd6f2"
SRC_URI[sha256sum] = "1c5044a6d6cf97df3bd877534c70d8cb13aaf3b97f1222a8ce65a54bb97b50d1"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
