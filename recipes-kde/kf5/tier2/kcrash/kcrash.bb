SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f413ced20b4b60bda87cbf2cb7340792"
SRC_URI[sha256sum] = "9d5a5fcbf59b4e64c39218477f76031e574a8d97b4974b957025688b14b2afc6"

SRC_URI += "file://0001-align-path-to-drkonqi.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
