SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3d4fe8eda589cca76ca846e8a151c638"
SRC_URI[sha256sum] = "cbcca13064b112dff26d1f78b1e77c8ad263cb663aab6329bc6e0a6505f4613d"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
