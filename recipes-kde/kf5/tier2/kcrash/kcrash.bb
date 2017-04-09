SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e4fd935ecafe399e84d25f31dbeb4bc"
SRC_URI[sha256sum] = "d34a51bdf021b7901c6270e26fbc101bd432e8d15b820f3a9aa464e2d4a6dc8c"
