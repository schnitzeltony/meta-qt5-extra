SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "375e5439158087180e9c779529df073b"
SRC_URI[sha256sum] = "5968694919e374b432b2e53ad1f6c15a018011ecd3c45d0b2d9dd586af090b0b"

SRC_URI += "file://0001-align-path-to-drkonqi.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
