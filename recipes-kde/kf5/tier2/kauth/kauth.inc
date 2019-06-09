SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "80da78562d813e834039c8c166d8f940"
SRC_URI[sha256sum] = "e7d9cbbc108df1c2d41038785967ed9a9489987462ba5f1f1a9d270ae9e1093c"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
