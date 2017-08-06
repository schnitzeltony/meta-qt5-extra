SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cf50f5b6f1d927148bfd1d456a9426ca"
SRC_URI[sha256sum] = "c0c9877a7c4f4d0630e934a903cc27fd127d0be63531c50ea77d63e10119558b"
