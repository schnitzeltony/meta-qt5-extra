SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6f42a5e7da6e8e02ceacd678e782919a"
SRC_URI[sha256sum] = "04a22615e03dc9db29daccfc437fd6d952e35b3dd39f52d95ea24115037aac42"
