SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "23ef0ce233866abda9cfbcf5f3de4f6e"
SRC_URI[sha256sum] = "030f6d983196b0cabff956511a0d266ebe16ebaa50635c7e6c2d12b5a3ca0164"
