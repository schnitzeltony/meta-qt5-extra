SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "70bcd1e0830b7ba8b4c51eddc5f2433c"
SRC_URI[sha256sum] = "13d8c4d2b7085216acae849f4e30f6287beeacf579cfedb84aef88ce179502de"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
