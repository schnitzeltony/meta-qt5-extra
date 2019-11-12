SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9f8ec9983c19c52b3bbce8e308725e7d"
SRC_URI[sha256sum] = "1bae70e4c6a033eea649efc17f0a060aba89144f4c469f235fbf5023dba5abc4"
