SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e2206fb13c1f7ecfc6ff8fdba3b6755"
SRC_URI[sha256sum] = "548cc6eeb13edf3d3cda94700fe0031cdab3ce5b2d2f47e1e48cf77107726ac2"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
