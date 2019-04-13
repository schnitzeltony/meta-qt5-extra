SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3e88ca2dbc20c47dab00c40b747e0899"
SRC_URI[sha256sum] = "9d6b9135cc47710b28e2a7731c4c5c1f6dba2b0e5fe982b9d2a82a11d7d497c2"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
