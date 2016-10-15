SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9b8848b193da6d8920d7853430408c0b"
SRC_URI[sha256sum] = "ce91d24ab2b3eb6d940c9277273694d3a652905b8256edcd3bbbed55c4f8c628"
