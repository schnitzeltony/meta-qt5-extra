SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons kcoreaddons-native ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a92890d1c668d7d60d241dcc90bf4e4e"
SRC_URI[sha256sum] = "14a0f9d5ecc387c88d24270dbf4c128deb8ad18ab64b39766b335ad03a47c3b6"
