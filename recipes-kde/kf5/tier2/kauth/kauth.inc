SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a98963e45c078d47f57e0f43c369baf2"
SRC_URI[sha256sum] = "6b7c270812268e1a6925011932d8f8242635775f610377582e991b86ec578130"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
