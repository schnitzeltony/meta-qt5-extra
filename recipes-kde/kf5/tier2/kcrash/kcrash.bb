SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "646b532f823f1b6fdadf0885ff0e3d29"
SRC_URI[sha256sum] = "526242aa9fde7cff11ecaa88bf75d6fbbfc412f46bf19a7a9e185f2adb616005"
