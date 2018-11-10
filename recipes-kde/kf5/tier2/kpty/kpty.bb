SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons kcoreaddons-native ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e60a43ae5c5144168a49d6611ad29f2a"
SRC_URI[sha256sum] = "02cd57c6fb41946d76e79153387db24de664f3f55db6664b37d65286ef91c78a"
