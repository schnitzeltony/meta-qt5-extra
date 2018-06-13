SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cbef8e3b01f5f514b0aea2a55aaa81c5"
SRC_URI[sha256sum] = "29c7c3d6c539d52200806502e4b11a132c1941512df6f2d3e073ed3e7f7e00e9"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
