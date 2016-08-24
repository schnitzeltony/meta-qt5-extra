SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "059033f3a41d6733bc92ed6f3fece2ef"
SRC_URI[sha256sum] = "1d62b32d88ba6c1e71e7b3ef67366710b9ce4488bcf82280fbe70d79b52f963a"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
