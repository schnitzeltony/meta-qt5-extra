SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "19b3dea73a09b9f5c174491ee0b1861c"
SRC_URI[sha256sum] = "c06ce55010745aedf787005d940241e49963fb06b8c3294411e2d1638142ca36"
