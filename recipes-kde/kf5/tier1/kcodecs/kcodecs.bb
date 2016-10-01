SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8788d7f42336ceba992ba8e32cb65549"
SRC_URI[sha256sum] = "931fb21946604ef5f4a4a36a6c7bdd40347d7a44a98edf291f361fe24becbfa3"
