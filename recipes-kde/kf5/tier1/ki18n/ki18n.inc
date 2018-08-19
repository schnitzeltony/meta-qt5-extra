SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a04e3c5b5c23c273fbdbdb3dea8fc0a1"
SRC_URI[sha256sum] = "5f4a54e755990104537729f4c26e054f146cd20acdd5e90cfd8558ab7a6e99c4"
