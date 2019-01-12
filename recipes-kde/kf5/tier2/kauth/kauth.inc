SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8c6423a34b205a01081fa60bfdc89dea"
SRC_URI[sha256sum] = "505c529d5456cf3eacdcdc8e80b5b258282d648f95b6ada7bbf99c17bf5a2ab2"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
