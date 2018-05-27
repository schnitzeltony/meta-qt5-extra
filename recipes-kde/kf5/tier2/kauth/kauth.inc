SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dd084a4c52e8e308fe2f17a5a6ffaab8"
SRC_URI[sha256sum] = "23af3df06e6db7c3fcd535de8659d3e33a06b879b07394a1397499fdbbda1f70"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
