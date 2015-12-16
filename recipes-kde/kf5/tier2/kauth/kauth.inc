SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "84489bee19eff7c58b9def9f93000783"
SRC_URI[sha256sum] = "c3e3a370a6b847cebf73ca8262b79142fc1e821d9dcb81c08063ba0a097cfb6c"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
