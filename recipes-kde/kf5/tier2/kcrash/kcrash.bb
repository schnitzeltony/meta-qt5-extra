SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "db49cf5fb083bf45dcca7c7813ee92ac"
SRC_URI[sha256sum] = "581e8215212a584886e8d4b6d5c1aac277590bcb343697d8b3653e1c22f6b1e0"
