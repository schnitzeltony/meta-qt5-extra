SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e061460f6ffae7c3b1eee220d59e1dd4"
SRC_URI[sha256sum] = "537b0a04895f455259f4fed325221a3513480ae34163447d4334b1c97e238e27"
