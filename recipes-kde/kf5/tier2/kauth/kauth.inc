SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a94fc1e5fb09982808a3525f86492738"
SRC_URI[sha256sum] = "ac95525bf1430868c8f54dbdc986478cf7b21192ad3b486381485b429eadddcc"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
