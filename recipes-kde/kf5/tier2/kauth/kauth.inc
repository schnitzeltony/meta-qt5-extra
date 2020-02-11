SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8677547f35f4d4720d41325fbd3a6336"
SRC_URI[sha256sum] = "4f4a0323adcfdc6f80c38c289a73a3b7af6bf5141acd80712eb669b6ffb8bcc3"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
