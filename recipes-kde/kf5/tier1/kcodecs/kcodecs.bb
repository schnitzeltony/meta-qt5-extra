SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "efc956f78601eb8b9537d7ddc61c47f8"
SRC_URI[sha256sum] = "6eb6935512e01a70d730938c28cb84852e73d4c023deebb5f2946b4c760f2aee"
