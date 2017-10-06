SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8681766fc193c7d9cd0a728adfc14f18"
SRC_URI[sha256sum] = "240ccf22a65cf85da900c88afceac8bedc40b71a4d19bad526c03aa285cc2a7d"
