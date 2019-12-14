SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7a456be5b972d65c8cb20a053541f003"
SRC_URI[sha256sum] = "277821947090e806f5850983e110134480915bf8e9609e0f24eaf34f7ca00c5f"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
