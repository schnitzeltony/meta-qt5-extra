SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kwindowsystem libxcb"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d85c85ecfe38a796c3bce4313df8ece7"
SRC_URI[sha256sum] = "3bdb5421b0909fa4e0d7bfb8bba708f9b95c4edf9ca1580aac8229512c49e224"
