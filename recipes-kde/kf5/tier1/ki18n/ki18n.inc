SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "95e67ba518ac2983e33ce8370bf0d3cd"
SRC_URI[sha256sum] = "3d108cf51dacf194afdd617d1d4bf56d97cf38b94d876479ea502c8c773e4c14"
