SUMMARY = "Syndication Library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    kcodecs \
"
PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "450567c456f2215cc02ec70c941d5744"
SRC_URI[sha256sum] = "c3e80e83601aa8c1b068c6fd9c1270fa56aafcc0cec4a263818bf04cffe23ddd"
