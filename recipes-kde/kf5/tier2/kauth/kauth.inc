SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4561d348d12a5be34c3b1c96ee1303e3"
SRC_URI[sha256sum] = "b57379f1d02ec44111d46726a1fb1f9db3b369fcd35192a302efc2a1f2f9ad5a"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
