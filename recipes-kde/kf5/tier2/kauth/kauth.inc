SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09df0ec91747f1f216cd5a703b165ce3"
SRC_URI[sha256sum] = "279af9593b3bf8b2730730877ff865944839e08d21855ea25864934fe372de8a"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
