SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "763af2796420512fcd32caecb4f11e97"
SRC_URI[sha256sum] = "b9a7cd724709ea188852f7656fbeda2dc3cc40cc5d09573049c2680c0edbd41f"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
