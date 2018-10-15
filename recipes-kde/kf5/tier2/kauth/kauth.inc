SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a6d1cd2e8ce03142cd678cb0bcd271cd"
SRC_URI[sha256sum] = "15faa8e4152b46a5833256ca6d39d22509487aa61853ee5d74c93e3869b2f95d"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
