SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "91916337e5a8edf9fca9de3bdd1ad8fa"
SRC_URI[sha256sum] = "659bc644a14bb9e31398b12808e3ffb154f8a696e3ea42d18398fab14b65697d"
