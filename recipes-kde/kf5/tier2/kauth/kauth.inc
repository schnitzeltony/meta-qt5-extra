SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9caa8c9db684df909a404c987b20bcd2"
SRC_URI[sha256sum] = "ec8f6bc9486c82045e3190609c528fc09897f115f4397328235687bba6b8cbf0"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
