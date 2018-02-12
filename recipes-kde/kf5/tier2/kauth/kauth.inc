SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8df3fbc742e0914d4f7d3132a34c4017"
SRC_URI[sha256sum] = "2e7002e6d30e42f09c8de6e6bcba4272f09666f0aa4acffe14c3e55a48df8817"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
