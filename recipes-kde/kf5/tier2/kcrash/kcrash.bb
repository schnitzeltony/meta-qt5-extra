SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6950db605ea79a079c6e062547c7d74b"
SRC_URI[sha256sum] = "db07f9605ff9f34875f285880fd5e6947fa5de0ddbfb329d370d40bf79f1543f"
