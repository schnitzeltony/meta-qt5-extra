SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6b6e6b459ff1f2599c30e1e92bc86b6d"
SRC_URI[sha256sum] = "1f1d7b014d60d1f52ee4c67a5c8eb8e5f0bf39df788b8c7475a7c9cab0e6277e"
