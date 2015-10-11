SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ff73dca44ac6d7f82d5d9d4d7b70d4d2"
SRC_URI[sha256sum] = "e2a91e1a4c40d5547c8963c74a805810b6bc192e3193245f52e855addc7219da"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
