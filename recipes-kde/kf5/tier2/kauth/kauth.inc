SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bf72c847526c8aff8899b366188e849e"
SRC_URI[sha256sum] = "20cff8f232ac648bbdad824d819786190ccab2eef2e285866952d63e3edf1ec2"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
