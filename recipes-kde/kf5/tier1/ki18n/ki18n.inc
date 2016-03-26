SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b2c5edb59d6ab4fd78d0bf68cfb631c6"
SRC_URI[sha256sum] = "226715a464a9b1d03c257d470ea0d6060fdfe35efc635108491cadb48512389c"
