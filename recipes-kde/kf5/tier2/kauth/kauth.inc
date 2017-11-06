SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "549c6d0fb3dcf269852cc4f07fedc4fe"
SRC_URI[sha256sum] = "b184b817d155b272cf42fa748c6d3c9f1713be423551d2a74e297821f6ee7221"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
