SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "314ae60902e4870ae4df51decf4cedf3"
SRC_URI[sha256sum] = "c767457c419055f3a6f5bfe0e2de140461c91f6451a5d3a385e6d6007cad9b3e"
