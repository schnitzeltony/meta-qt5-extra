SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c509d0fe457a7f0ca22d5d02ee4037a0"
SRC_URI[sha256sum] = "6c68db4ee049631c08cadde8f4991764ec03cfab4e6780d3a16c7a15e7e4c061"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
