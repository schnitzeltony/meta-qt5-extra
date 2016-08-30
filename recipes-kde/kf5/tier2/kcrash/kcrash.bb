SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ecf5dde757c1cf5e3d00d3cfe661474d"
SRC_URI[sha256sum] = "a84a9a5b73c51678d84cfe9d87a945f992e6035a9dbd29040bbe5dbcfd38ba6e"
