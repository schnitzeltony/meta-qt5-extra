SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a6bd7a449ccfbbab1a3e400d984ceabe"
SRC_URI[sha256sum] = "e2f2be1120d403343f0304b0ba5996b4da3592dbd8f486cfec208efaf38740e7"
