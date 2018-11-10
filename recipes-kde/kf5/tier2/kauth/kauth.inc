SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ab9cc12cbcf19583a975e6e049f0e7aa"
SRC_URI[sha256sum] = "b5f7a8c4e13dfcb904d0767e87354420cf385d1e02e53d4a5bb329bc71f72079"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
