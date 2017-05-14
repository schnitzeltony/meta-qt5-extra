SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d5133f83bc354eab9e42fcf588cddbd2"
SRC_URI[sha256sum] = "05a72132df6001069273cc1425d65e890edf8112ac88cd2c6b61f5a3ee0d38d2"
