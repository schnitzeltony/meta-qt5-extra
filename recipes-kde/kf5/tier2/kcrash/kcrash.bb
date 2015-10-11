SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8a205f76a3ca73b585cfabfafdc97571"
SRC_URI[sha256sum] = "7eac0e5ed260bf60c674a82981aaac81feea9ca5b6bb2a34256b95845ee56198"

SRC_URI += "file://0001-align-path-to-drkonqi.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
