SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons kcoreaddons-native ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5421e4cf962aad7ff75dd2ab3ba8c588"
SRC_URI[sha256sum] = "50d5b7404e297b3f4aefcd7314753e4f7ab2e557ce469a8c104e2b91698ce6c2"
