SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e6a5226f42a3cc444938fb80a7463ab4"
SRC_URI[sha256sum] = "85114fb458e66ca7ce02e06fb1b6541989c3516d68873d2ca3fc2438d7258dcd"
