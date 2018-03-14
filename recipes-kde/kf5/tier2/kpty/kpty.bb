SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons kcoreaddons-native ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d4ed27252edc65da197d54a7db6c1415"
SRC_URI[sha256sum] = "803bbe7f1c409b0cc67091a96da33341f52f5c01df9a640ac99dcf3a92c15d22"
