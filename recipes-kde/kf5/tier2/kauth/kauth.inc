SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ed2183a6db12ce48f96b844287e53925"
SRC_URI[sha256sum] = "c8029c6a3bdeb296e27eaf3791d269ebe88641ee9170bdabd5a2bb391effe361"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
