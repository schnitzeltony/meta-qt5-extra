SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "101333dd21432b699094b663ad503324"
SRC_URI[sha256sum] = "31162621200df4b927719e34ce62004c51e79b9d785f9c3056c6902f80eeefe6"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
