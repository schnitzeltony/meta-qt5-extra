SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a00223a8266634deb16530c09aa5b604"
SRC_URI[sha256sum] = "1f79d51599c9fb198783c5dbf007011d2c73569af007951d92f5efcc22ce044b"

SRC_URI += "file://0001-align-path-to-drkonqi.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
