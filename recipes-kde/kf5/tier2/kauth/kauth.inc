SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "e334705bfc3f81c5e2f66315d40badd26d88426128432788f790ebefce1694d9"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
