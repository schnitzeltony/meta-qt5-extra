SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "953c004b5669a6cf918858666f1eb7a6"
SRC_URI[sha256sum] = "2c4917f0bb49f09b232aeda9d3282eef0e235124fab1dab0deeae2ae7a7df321"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
