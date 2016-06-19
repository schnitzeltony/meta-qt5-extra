SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eee903d5ed5575487769403a4979c016"
SRC_URI[sha256sum] = "5766c2ac116ad8eb2c33bc197db3c80337fc5d3de7245291ea0615173bef7b91"
