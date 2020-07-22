SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4db325b44bdcf4b86a1c599bdeda8519"
SRC_URI[sha256sum] = "e88c332680bd860bc8a3d71088dcbd02b7ab94c21721ca5b88e9c6f57e5f708b"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
