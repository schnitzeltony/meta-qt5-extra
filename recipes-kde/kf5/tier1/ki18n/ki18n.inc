SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d3b4ea17742aba2a24b8b3115a5df47d"
SRC_URI[sha256sum] = "b885bcde4cdf700ecbd8487c52ced453de67c44dac014b53b4eefbba5353ae41"
