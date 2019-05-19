SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "82e0f37a01ad489db993833470ea59a8"
SRC_URI[sha256sum] = "ea0181b15ff47b34ae7dd7a3a419c461cf05554f9014886d8b8b2ab2ec243977"
