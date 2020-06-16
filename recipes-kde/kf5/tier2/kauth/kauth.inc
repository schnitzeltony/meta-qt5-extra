SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8af884f84f6c07c03063f5c3b7018d64"
SRC_URI[sha256sum] = "a0de83bd662e20253011216ab8cba597f8db7429f8706237e7307580125025b5"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
