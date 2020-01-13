SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "19e2bdd8d2dac6281968b239ac3e3d56"
SRC_URI[sha256sum] = "5a518059de3f3e85ee7b38a0edf348d097993518ce9b17504470f0d8aad3f2e4"
