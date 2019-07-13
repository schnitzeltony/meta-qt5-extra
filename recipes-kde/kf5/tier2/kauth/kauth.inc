SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "00330dac282b372701a3f81de66c2e01"
SRC_URI[sha256sum] = "50a2a2eb90d7529bb6fc4ddd77e37ef5b25c612b18487cc63d8d086d5ec28916"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
