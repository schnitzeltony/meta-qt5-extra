SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7d29a6ce7088215457f2eb0bba7ae616"
SRC_URI[sha256sum] = "80b8f7a7038cfbe12deb18d040a1e6d1ae19f3d6b01a35572b874f3f6f6ca726"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
