SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ea724c2152b88149893784a234c5bbcc"
SRC_URI[sha256sum] = "1430e9f480c8fffdefe7281c4b6365472404e2d549647aeda73cf497a5b9d8cd"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
