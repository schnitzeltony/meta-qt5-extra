SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "91a663cdf43e6c5383483e8e9284e1ef"
SRC_URI[sha256sum] = "30f95c643cd9e39c9c497137f6dc8ed3a91938a803d3ffd82a05235f24a150f2"
