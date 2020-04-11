SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "89103d42d5e1bdbde1f519865b31a9aa"
SRC_URI[sha256sum] = "b6bc671e47a4cdb31c14965a1a68c7ac1a7e362c27e759ff41bd4c89e90cca40"
