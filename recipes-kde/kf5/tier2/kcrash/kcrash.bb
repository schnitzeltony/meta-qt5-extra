SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bdbe144c7c086e60206f097bfc3703d8"
SRC_URI[sha256sum] = "2d8edd9813b8543cef68cd6cf09c85195999d06f9b06ed0803707a1c925eda38"
