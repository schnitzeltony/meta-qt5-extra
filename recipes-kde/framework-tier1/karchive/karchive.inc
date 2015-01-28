SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

DEPENDS += "bzip2 xz zlib"

SRCREV = "05dd0f7fac116d905e37e01807b7d20489ceb1ca"
PV = "5.7.0"
