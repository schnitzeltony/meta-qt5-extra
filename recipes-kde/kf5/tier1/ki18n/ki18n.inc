SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f244b3541f0b8cc5c662f844b49764c9"
SRC_URI[sha256sum] = "76d3306da302250c0b78441d1ddeb8cbae803958b75f30514f181566d0efce2c"
