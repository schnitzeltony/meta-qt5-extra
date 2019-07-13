SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0cf6a6c0a4aa8427763a1d8bb61a88e2"
SRC_URI[sha256sum] = "b94598e6cb40019c9db403cb392b647d798692899467883f2f9419e1de5782c3"
