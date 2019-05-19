SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a5df25b21f6aab84e310cd1d4f201141"
SRC_URI[sha256sum] = "8c004199f1e7aa14f9244299bb8b288f6d077e5c2557f089a530d0c1cd072f4f"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
