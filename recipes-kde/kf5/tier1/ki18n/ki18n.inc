SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d26f14f17a4b3435f3d9db21592fad90"
SRC_URI[sha256sum] = "fc0adac69568672e26fd4daa201a33a2e9c4e854460dd1f3bd64a10eba8d1d22"
