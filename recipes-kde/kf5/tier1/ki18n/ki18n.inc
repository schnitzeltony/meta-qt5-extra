SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "62457f60936bb8dc6649ed362e7ab80a"
SRC_URI[sha256sum] = "2f7926073587a2b2d428c2b19ea16e0e6a31bb5be65b77bb5b02cfa1483489e0"
